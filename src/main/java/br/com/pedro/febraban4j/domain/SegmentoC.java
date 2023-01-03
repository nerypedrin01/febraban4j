package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoC implements Segmentos {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codSegmento;

	@FebrabanPostion(tamanho = 15)
	private Float valorCSLL;

	@FebrabanPostion(tamanho = 8)
	private String brancos;

	@FebrabanPostion(tamanho = 8)
	private String dataVencimento;

	@FebrabanPostion(tamanho = 15)
	private Float valorDocumento;

	@FebrabanPostion(tamanho = 15)
	private Float valorPis;

	@FebrabanPostion(tamanho = 15)
	private Float valorIr;

	@FebrabanPostion(tamanho = 15)
	private Float valorIs;

	@FebrabanPostion(tamanho = 15)
	private Float valorCofinsValor;

	@FebrabanPostion(tamanho = 15)
	private Float valorDesconto;

	@FebrabanPostion(tamanho = 15)
	private Float valorAbatimento;

	@FebrabanPostion(tamanho = 15)
	private Float valorDeducoes;

	@FebrabanPostion(tamanho = 15)
	private Float valorMora;

	@FebrabanPostion(tamanho = 15)
	private Float valorMulta;

	@FebrabanPostion(tamanho = 15)
	private Float outrosAcrescimos;

	@FebrabanPostion(tamanho = 20)
	private String numerofatura;

	@FebrabanPostion(tamanho = 10)
	private String brancos2;

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

	public String getCodSegmento() {
		return codSegmento;
	}

	public void setCodSegmento(String codSegmento) {
		this.codSegmento = codSegmento;
	}

	public Float getValorCSLL() {
		return valorCSLL;
	}

	public void setValorCSLL(Float valorCSLL) {
		this.valorCSLL = valorCSLL;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Float getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(Float valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public Float getValorPis() {
		return valorPis;
	}

	public void setValorPis(Float valorPis) {
		this.valorPis = valorPis;
	}

	public Float getValorIr() {
		return valorIr;
	}

	public void setValorIr(Float valorIr) {
		this.valorIr = valorIr;
	}

	public Float getValorIs() {
		return valorIs;
	}

	public void setValorIs(Float valorIs) {
		this.valorIs = valorIs;
	}

	public Float getValorCofinsValor() {
		return valorCofinsValor;
	}

	public void setValorCofinsValor(Float valorCofinsValor) {
		this.valorCofinsValor = valorCofinsValor;
	}

	public Float getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Float getValorAbatimento() {
		return valorAbatimento;
	}

	public void setValorAbatimento(Float valorAbatimento) {
		this.valorAbatimento = valorAbatimento;
	}

	public Float getValorDeducoes() {
		return valorDeducoes;
	}

	public void setValorDeducoes(Float valorDeducoes) {
		this.valorDeducoes = valorDeducoes;
	}

	public Float getValorMora() {
		return valorMora;
	}

	public void setValorMora(Float valorMora) {
		this.valorMora = valorMora;
	}

	public Float getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(Float valorMulta) {
		this.valorMulta = valorMulta;
	}

	public Float getOutrosAcrescimos() {
		return outrosAcrescimos;
	}

	public void setOutrosAcrescimos(Float outrosAcrescimos) {
		this.outrosAcrescimos = outrosAcrescimos;
	}

	public String getNumerofatura() {
		return numerofatura;
	}

	public void setNumerofatura(String numerofatura) {
		this.numerofatura = numerofatura;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

}
