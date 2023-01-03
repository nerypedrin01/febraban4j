package br.com.pedro.febraban4j.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.pedro.febraban4j.domain.Arquivo;
import br.com.pedro.febraban4j.domain.HeaderArquivo;
import br.com.pedro.febraban4j.domain.HeaderLote;
import br.com.pedro.febraban4j.domain.Lote;
import br.com.pedro.febraban4j.domain.RegistroTrailerLote;
import br.com.pedro.febraban4j.domain.SegmentoAO;
import br.com.pedro.febraban4j.domain.TrailerArquivo;
import br.com.pedro.febraban4j.excepion.Febraban4jException;
import br.com.pedro.febraban4j.interfaces.Segmentos;
import br.com.pedro.febraban4j.util.Converter;
import br.com.pedro.febraban4j.util.Febranator;

public class CnabGravarTeste {
	public static void main(String[] args) throws IOException, Febraban4jException {

		HeaderArquivo headerArq = new HeaderArquivo();
		headerArq.setCodigBanco(14);
		headerArq.setCodigoLote(2);
		headerArq.setTipoRegistro(0);
		headerArq.setBrancos1("");

		headerArq.setLayoutArquivo(8);
		headerArq.setTipoInscricao(1);
		headerArq.setNumeroInscricao(45454545L);
		headerArq.setBrancos2("");

		headerArq.setAgencia(2306);
		headerArq.setBrancos3("");

		headerArq.setConta(002356);
		headerArq.setBrancos4("");

		headerArq.setDac(1);
		headerArq.setNomeEmpresa("Nome Empresa");
		headerArq.setNomeBanco("Caixa");
		headerArq.setBrancos5(" ");

		headerArq.setCodigoRT(0);
		headerArq.setDataCadastro(Converter.dateToInt(new Date()));
		headerArq.setHoraCadastro(Converter.timeToInt(new Date()));
		headerArq.setZeros(0);

		headerArq.setUnidadeDensidade(5);
		headerArq.setBrancos6(" ");

		// cria lote
		Lote lote = new Lote();

		// cria Lista Segmentos
		List<Segmentos> segmentos = new ArrayList<Segmentos>();

		SegmentoAO segmentoA = new SegmentoAO();
		segmentoA.setCodigoBanco(2);
		segmentoA.setCodigoLote(3);
		segmentoA.setRegistroLote(3);
		segmentoA.setNumeroRegistro(489);
		segmentoA.setCodSegmento("A");
		segmentoA.setTipoMovimento(41);
		segmentoA.setCamera(12);
		segmentoA.setBancoFavorecido(25);
		segmentoA.setAgenciaContaFav("65656");
		segmentoA.setNomeFavorecido("calçados");
		segmentoA.setNumeroDoc("55");
		segmentoA.setDataDePagamento(Converter.dateToInt(new Date()));
		segmentoA.setMoeda("REA");
		segmentoA.setCodigoISPB("544");
		segmentoA.setIdentificacaoTransferencia("1");
		segmentoA.setZeros(0);
		segmentoA.setValorPagamento(59999);
		segmentoA.setNumeroBancoRet(" ");
		segmentoA.setBrancos(" ");
		segmentoA.setDataEfetivaRet(0);
		segmentoA.setValotEfetivoRet(0);
		segmentoA.setFinalidadeDetalhe("PgtMoveis");
		segmentoA.setNumeroDocRet(" ");
		segmentoA.setNumeroInscricao(45454545L);
		segmentoA.setFinalidadeDocumento("2");
		segmentoA.setFinalidadeTed("131");
		segmentoA.setBrancos2(" ");
		segmentoA.setAviso("1");
		segmentoA.setOcorrenciasRet(" ");

		segmentos.add(segmentoA);

		lote.setSegmentos(segmentos);

		// criaHeaderLote
		HeaderLote headerLote = new HeaderLote();
		headerLote.setCodigoBanco(14);
		headerLote.setCodigoLote(1);
		headerLote.setTipoRegistro(1);
		headerLote.setTipoOperacao("C");
		headerLote.setTipoPagamento(2);
		headerLote.setFormaPamento(2);
		headerLote.setLayoutLote(1);
		headerLote.setBrancos(" ");
		headerLote.setTipoInscricao(1);
		headerLote.setInscricaoEmpresa(45454545L);
		headerLote.setBrancos2(" ");
		headerLote.setAgencia(565);
		headerLote.setBrancos3(" ");
		headerLote.setConta(6565656);
		headerLote.setBrancos4(" ");
		headerLote.setDac(3);
		headerLote.setNomeEmpresa("Imobiliaria");
		headerLote.setFinalidadeLote("Aluguel");
		headerLote.setHistoricoContaCorrente("Aluguel");
		headerLote.setEnderecoEmpresa("Qasda27,as,ad");
		headerLote.setNumeroEndereco(1);
		headerLote.setComplemento("asd");
		headerLote.setNomeCidade("as");
		headerLote.setCep(72110270);
		headerLote.setUf("DF");
		headerLote.setBrancos5(" ");
		headerLote.setOcorrenciasRet(" ");

		lote.setHeaderLote(headerLote);

		// cria Trailler Lote
		RegistroTrailerLote registroTrailerLote = new RegistroTrailerLote();
		registroTrailerLote.setCodigoBanco(18);
		registroTrailerLote.setCodigoLote(5);
		registroTrailerLote.setTipoRegistro(5);
		registroTrailerLote.setBrancos(" ");
		registroTrailerLote.setTotalQtdRegistro(segmentos.size());
		registroTrailerLote.setTotalValorPagamentos(segmentoA.getValorPagamento());
		registroTrailerLote.setZeros(0);
		registroTrailerLote.setBrancos2(" ");
		registroTrailerLote.setOcorrenciasRet(" ");
		lote.setRegistroTrailerLote(registroTrailerLote);

		List<Lote> lotes = new ArrayList<Lote>();
		lotes.add(lote);

		// cria Trailler do Arquivo
		TrailerArquivo trailerArquivo = new TrailerArquivo();
		trailerArquivo.setCodigoBanco(31);
		trailerArquivo.setCodigoLote(9);
		trailerArquivo.setTipoRegistro(9);
		trailerArquivo.setBrancos(" ");
		trailerArquivo.setTotalLotesArquivos(lotes.size());
		trailerArquivo.setTotalRegistroArqv(lotes.size());
		trailerArquivo.setBrancos2(" ");

		Arquivo arquivo = new Arquivo(headerArq, lotes, trailerArquivo);

		Febranator febranator = new Febranator();
		try {
			String text = febranator.toString(arquivo);
			FileWriter writer = new FileWriter(new File(""));
			writer.write(text);
			writer.close();
		} catch (Febraban4jException ex) {
			ex.printStackTrace();
		}
	}

	}
	
