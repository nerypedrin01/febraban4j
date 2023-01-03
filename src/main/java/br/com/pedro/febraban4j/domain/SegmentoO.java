package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoO implements Segmentos {

	@FebrabanPostion(tamanho = 03)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 04)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 01)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codigoSegmento;

	@FebrabanPostion(tamanho = 3)
	private Integer tipoMovimento;

	@FebrabanPostion(tamanho = 48)
	private String codigoBarras;

	@FebrabanPostion(tamanho = 30)
	private String nomeConcessionaria;

	@FebrabanPostion(tamanho = 8)
	private Integer dataVencimento;

	@FebrabanPostion(tamanho = 3)
	private String tipoMoeda;

	@FebrabanPostion(tamanho = 15)
	private Float qtdMoeda;

	@FebrabanPostion(tamanho = 15)
	private Float valorAPagar;

	@FebrabanPostion(tamanho = 8)
	private Integer dataPagamento;

	@FebrabanPostion(tamanho = 15)
	private Float valorPago;

	@FebrabanPostion(tamanho = 3)
	private String brancos;

	@FebrabanPostion(tamanho = 9)
	private Integer numeronotaFiscal;

	@FebrabanPostion(tamanho = 3)
	private String brancos2;

	@FebrabanPostion(tamanho = 20)
	private String seuNumero;

	@FebrabanPostion(tamanho = 21)
	private String brancos3;

	@FebrabanPostion(tamanho = 15)
	private String numeroBanco;

	@FebrabanPostion(tamanho = 10)
	private String ocorrencias;

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

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNomeConcessionaria() {
		return nomeConcessionaria;
	}

	public void setNomeConcessionaria(String nomeConcessionaria) {
		this.nomeConcessionaria = nomeConcessionaria;
	}

	public Integer getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Integer dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(String tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}

	public Float getQtdMoeda() {
		return qtdMoeda;
	}

	public void setQtdMoeda(Float qtdMoeda) {
		this.qtdMoeda = qtdMoeda;
	}

	public Float getValorAPagar() {
		return valorAPagar;
	}

	public void setValorAPagar(Float valorAPagar) {
		this.valorAPagar = valorAPagar;
	}

	public Integer getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Integer dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Float getValorPago() {
		return valorPago;
	}

	public void setValorPago(Float valorPago) {
		this.valorPago = valorPago;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public Integer getNumeronotaFiscal() {
		return numeronotaFiscal;
	}

	public void setNumeronotaFiscal(Integer numeronotaFiscal) {
		this.numeronotaFiscal = numeronotaFiscal;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getSeuNumero() {
		return seuNumero;
	}

	public void setSeuNumero(String seuNumero) {
		this.seuNumero = seuNumero;
	}

	public String getBrancos3() {
		return brancos3;
	}

	public void setBrancos3(String brancos3) {
		this.brancos3 = brancos3;
	}

	public String getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(String numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public String getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}


}