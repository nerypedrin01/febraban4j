package br.com.pedro.febraban4j.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.domain.Arquivo;
import br.com.pedro.febraban4j.domain.HeaderArquivo;
import br.com.pedro.febraban4j.domain.HeaderLote;
import br.com.pedro.febraban4j.domain.Lote;
import br.com.pedro.febraban4j.domain.RegistroTrailerLote;
import br.com.pedro.febraban4j.domain.SegmentoAO;
import br.com.pedro.febraban4j.domain.SegmentoBO;
import br.com.pedro.febraban4j.domain.SegmentoE;
import br.com.pedro.febraban4j.domain.SegmentoF;
import br.com.pedro.febraban4j.domain.SegmentoJ;
import br.com.pedro.febraban4j.domain.SegmentoJ52;
import br.com.pedro.febraban4j.domain.SegmentoN;
import br.com.pedro.febraban4j.domain.SegmentoO;
import br.com.pedro.febraban4j.domain.SegmentoZ;
import br.com.pedro.febraban4j.domain.TrailerArquivo;
import br.com.pedro.febraban4j.excepion.Febraban4jException;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class Febranator {

	public String toString(Arquivo arquivo) throws Febraban4jException {

		StringBuilder ret = new StringBuilder();

		String arquivoHeader = objectToString(arquivo.getHeaderArquivo());
		ret.append(arquivoHeader);
		ret.append("\r\n");

		for (Lote lote : arquivo.getLotes()) {
			String loteHeader = objectToString(lote.getHeaderLote());
			ret.append(loteHeader);
			ret.append("\r\n");

			for (Segmentos segmento : lote.getSegmentos()) {
				String segmentoStr = objectToString(segmento);
				ret.append(segmentoStr);
				ret.append("\r\n");
			}

			String loteTrailer = objectToString(lote.getRegistroTrailerLote());
			ret.append(loteTrailer);
			ret.append("\r\n");
		}

		String trailerArquivo = objectToString(arquivo.getTriller());
		ret.append(trailerArquivo);
		ret.append("\r\n");

		return ret.toString();
	}

	private String objectToString(Object obj) throws Febraban4jException {

		StringBuilder sb = new StringBuilder();
		for (Field field : obj.getClass().getDeclaredFields()) {
			try {
				if (field.isAnnotationPresent(FebrabanPostion.class)) {
					FebrabanPostion annotation = field.getAnnotation(FebrabanPostion.class);
					field.setAccessible(true);
					String coluna;
					if (field.getType().equals(String.class)) {
						coluna = StringUtils.leftPad(((String) field.get(obj)).toUpperCase(), annotation.tamanho(),
								' ');
					} else if (field.getType().equals(Integer.class)) {
						coluna = StringUtils.leftPad(Integer.toString(((Integer) field.get(obj))), annotation.tamanho(),
								'0');
					} else if (field.getType().equals(Long.class)) {
						coluna = StringUtils.leftPad(Long.toString(((Long) field.get(obj))), annotation.tamanho(), '0');
					} else {
						throw new Febraban4jException("Tipo imcompativel: " + field.getName());
					}
					// Valida tamanho do campo
					if (coluna.length() > annotation.tamanho())
						throw new Febraban4jException(
								"Tamanho do campo maior que o esperado: " + field.getName() + " of " + obj.getClass());
					sb.append(coluna);
				}
			} catch (NullPointerException ex) {
				throw new Febraban4jException("Campo nulo: " + field.getName() + " of " + obj.getClass());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		sb.toString();

		// Valida tamanho do linha
		if (sb.toString().length() != 240)
			throw new Febraban4jException(
					"Tamanho esperado 240: " + obj.getClass() + " tamanho encontrado: " + sb.length());

		return sb.toString();
	}

	@SuppressWarnings("unused")
	public Arquivo fromString(List<String> linhas) throws Febraban4jException {

		Arquivo arquivo = new Arquivo();
		List<Lote> lotes = new ArrayList<>();
		arquivo.setLotes(lotes);
		Lote lote = null;
		String ultimoSegmento = null;

		for (String linha : linhas) {
			String codigoRegistro = linha.substring(7, 8);

			if (codigoRegistro.equals("0")) {
				HeaderArquivo arquivoHeader = (HeaderArquivo) stringToObject(linha, HeaderArquivo.class);
				arquivo.setHeaderArquivo(arquivoHeader);
			} else if (codigoRegistro.equals("1")) {
				lote = new Lote();
				lotes.add(lote);
				lote.setSegmentos(new ArrayList<Segmentos>());
				HeaderLote loteHeader = (HeaderLote) stringToObject(linha, HeaderLote.class);
				lote.setHeaderLote(loteHeader);
			} else if (codigoRegistro.equals("3")) {
				String codSegmento = linha.substring(13, 14);
				if (codSegmento.equals("J")) {
					String identificacaoRegistro = linha.substring(17, 19);
					if (!identificacaoRegistro.equals("52")) {
						SegmentoJ segmento = (SegmentoJ) stringToObject(linha, SegmentoJ.class);
						lote.getSegmentos().add((Segmentos) segmento);
					} else {
						SegmentoJ52 segmento = (SegmentoJ52) stringToObject(linha, SegmentoJ52.class);
						lote.getSegmentos().add(segmento);
					}
				} else if (codSegmento.equals("O")) {
					Segmentos segmento = (SegmentoO) stringToObject(linha, SegmentoO.class);
					lote.getSegmentos().add(segmento);
				} else if (codSegmento.equals("N")) {
					SegmentoN segmento = (SegmentoN) stringToObject(linha, SegmentoN.class);
					lote.getSegmentos().add(segmento);
					ultimoSegmento = codSegmento;
				} else if (codSegmento.equals("A")) {
					SegmentoAO segmento = (SegmentoAO) stringToObject(linha, SegmentoAO.class);
					lote.getSegmentos().add(segmento);
					ultimoSegmento = codSegmento;
				} else if (codSegmento.equals("B")) {
					SegmentoBO segmentoB = (SegmentoBO) stringToObject(linha, SegmentoBO.class);
					lote.getSegmentos().add(segmentoB);
					ultimoSegmento = codSegmento;

				} else if (codSegmento.equals("Z")) {
					SegmentoZ segmentoZ = (SegmentoZ) stringToObject(linha, SegmentoZ.class);
					lote.getSegmentos().add(segmentoZ);
					ultimoSegmento = codSegmento;

				} else if (codSegmento.equals("F")) {
					SegmentoF segmentoF = (SegmentoF) stringToObject(linha, SegmentoF.class);
					lote.getSegmentos().add(segmentoF);
					ultimoSegmento = codSegmento;

				} else if (codSegmento.equals("E")) {
					SegmentoE segmentoE = (SegmentoE) stringToObject(linha, SegmentoE.class);
					lote.getSegmentos().add(segmentoE);
					ultimoSegmento = codSegmento;

				}

				else {
					throw new Febraban4jException("Segmento desconhecido: " + codSegmento);
				}
			} else if (codigoRegistro.equals("5")) {
				RegistroTrailerLote loteTrailer = (RegistroTrailerLote) stringToObject(linha,
						RegistroTrailerLote.class);
				lote.setRegistroTrailerLote(loteTrailer);
				lote = null;
			} else if (codigoRegistro.equals("9")) {
				TrailerArquivo arquivoTrailer = (TrailerArquivo) stringToObject(linha, TrailerArquivo.class);
				arquivo.setTriller(arquivoTrailer);
			} else {
				throw new Febraban4jException("Registro desconhecido: " + codigoRegistro);
			}
		}

		return arquivo;
	}

	private Object stringToObject(String linha, Class<?> clazz) throws Febraban4jException {

		try {
			Object obj = clazz.getDeclaredConstructor().newInstance();
			int ultimaPos = 0;
			for (Field field : clazz.getDeclaredFields()) {
				try {
					if (field.isAnnotationPresent(FebrabanPostion.class)) {
						FebrabanPostion annotation = field.getAnnotation(FebrabanPostion.class);
						String coluna = linha.substring(ultimaPos, ultimaPos + annotation.tamanho());
						field.setAccessible(true);
						if (field.getType().equals(String.class)) {
							field.set(obj, coluna.trim());
						} else if (field.getType().equals(Integer.class)) {
							field.set(obj, Integer.parseInt(coluna));
						} else if (field.getType().equals(Long.class)) {
							field.set(obj, Long.parseLong(coluna));
						} else {
							throw new Febraban4jException("Tipo imcompativel: " + field.getName());
						}
						ultimaPos += annotation.tamanho();
					}
				} catch (NullPointerException ex) {
					throw new Febraban4jException("Campo nulo: " + field.getName() + " of " + obj.getClass());
				} catch (IllegalArgumentException e) {
					throw new Febraban4jException(
							"Campo: " + field.getName() + " of " + obj.getClass() + " Err: " + e.getMessage());
				} catch (IllegalAccessException e) {
					throw new Febraban4jException(e.getMessage());
				}
			}
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Febraban4jException(e.getMessage());
		}
	}

}
