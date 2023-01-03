package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoN implements Segmentos {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codigoSegmento;

	@FebrabanPostion(tamanho = 3)
	private Integer tipoMovimento;

	@FebrabanPostion(tamanho = 178)
	private String dadoDoTributo;

	@FebrabanPostion(tamanho = 20)
	private String seuNumero;

	@FebrabanPostion(tamanho = 15)
	private String numeroBanco;

	@FebrabanPostion(tamanho = 10)
	private String ocorrencia;

	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Integer getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(Integer codigoLote) {
		this.codigoLote = codigoLote;
	}

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getCodigoSegmento() {
		return codigoSegmento;
	}

	public void setCodigoSegmento(String codigoSegmento) {
		this.codigoSegmento = codigoSegmento;
	}

	public Integer getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(Integer tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public String getDadoDoTributo() {
		return dadoDoTributo;
	}

	public void setDadoDoTributo(String dadoDoTributo) {
		this.dadoDoTributo = dadoDoTributo;
	}

	public String getSeuNumero() {
		return seuNumero;
	}

	public void setSeuNumero(String seuNumero) {
		this.seuNumero = seuNumero;
	}

	public String getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(String numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	
}