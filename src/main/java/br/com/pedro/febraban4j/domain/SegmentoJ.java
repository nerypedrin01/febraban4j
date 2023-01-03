package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoJ implements Segmentos{

	@FebrabanPostion(tamanho = 3)
	private int codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private int codigoLote;

	@FebrabanPostion(tamanho = 1)
	private int tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private int numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codigoSegmento = "J";

	@FebrabanPostion(tamanho = 3)
	private int tipoMovimento;

	@FebrabanPostion(tamanho = 3)
	private int bancoFavorecidoCodBarra;

	@FebrabanPostion(tamanho = 1)
	private int moedaCodBarra;

	@FebrabanPostion(tamanho = 1)
	private int dvCodBarra;

	@FebrabanPostion(tamanho = 4)
	private int vencimentoCodBarra;

	@FebrabanPostion(tamanho = 10)
	private int valorCodBarra;

	@FebrabanPostion(tamanho = 25)
	private int campoLivreCodBarra;

	@FebrabanPostion(tamanho = 30)
	private String nomeFavorecido;

	@FebrabanPostion(tamanho = 8)
	private int dataVencimento;

	@FebrabanPostion(tamanho = 15)
	private int valorTitulo;

	@FebrabanPostion(tamanho = 15)
	private int descontos;

	@FebrabanPostion(tamanho = 15)
	private int acrescimos;

	@FebrabanPostion(tamanho = 8)
	private int dataPamento;

	@FebrabanPostion(tamanho = 15)
	private int valorPagamento;

	@FebrabanPostion(tamanho = 15)
	private int zeros;

	@FebrabanPostion(tamanho = 20)
	private String seuNumero;

	@FebrabanPostion(tamanho = 13)
	private String brancos;

	@FebrabanPostion(tamanho = 15)
	private String numeroBancoRet;

	@FebrabanPostion(tamanho = 10)
	private String ocorrrencias;

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public int getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(int codigoLote) {
		this.codigoLote = codigoLote;
	}

	public int getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(int tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getCodigoSegmento() {
		return codigoSegmento;
	}

	public void setCodigoSegmento(String codigoSegmento) {
		this.codigoSegmento = codigoSegmento;
	}

	public int getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(int tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public int getBancoFavorecidoCodBarra() {
		return bancoFavorecidoCodBarra;
	}

	public void setBancoFavorecidoCodBarra(int bancoFavorecidoCodBarra) {
		this.bancoFavorecidoCodBarra = bancoFavorecidoCodBarra;
	}

	public int getMoedaCodBarra() {
		return moedaCodBarra;
	}

	public void setMoedaCodBarra(int moedaCodBarra) {
		this.moedaCodBarra = moedaCodBarra;
	}

	public int getDvCodBarra() {
		return dvCodBarra;
	}

	public void setDvCodBarra(int dvCodBarra) {
		this.dvCodBarra = dvCodBarra;
	}

	public int getVencimentoCodBarra() {
		return vencimentoCodBarra;
	}

	public void setVencimentoCodBarra(int vencimentoCodBarra) {
		this.vencimentoCodBarra = vencimentoCodBarra;
	}

	public int getValorCodBarra() {
		return valorCodBarra;
	}

	public void setValorCodBarra(int valorCodBarra) {
		this.valorCodBarra = valorCodBarra;
	}

	public int getCampoLivreCodBarra() {
		return campoLivreCodBarra;
	}

	public void setCampoLivreCodBarra(int campoLivreCodBarra) {
		this.campoLivreCodBarra = campoLivreCodBarra;
	}

	public String getNomeFavorecido() {
		return nomeFavorecido;
	}

	public void setNomeFavorecido(String nomeFavorecido) {
		this.nomeFavorecido = nomeFavorecido;
	}

	public int getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public int getValorTitulo() {
		return valorTitulo;
	}

	public void setValorTitulo(int valorTitulo) {
		this.valorTitulo = valorTitulo;
	}

	public int getDescontos() {
		return descontos;
	}

	public void setDescontos(int descontos) {
		this.descontos = descontos;
	}

	public int getAcrescimos() {
		return acrescimos;
	}

	public void setAcrescimos(int acrescimos) {
		this.acrescimos = acrescimos;
	}

	public int getDataPamento() {
		return dataPamento;
	}

	public void setDataPamento(int dataPamento) {
		this.dataPamento = dataPamento;
	}

	public int getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(int valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public int getZeros() {
		return zeros;
	}

	public void setZeros(int zeros) {
		this.zeros = zeros;
	}

	public String getSeuNumero() {
		return seuNumero;
	}

	public void setSeuNumero(String seuNumero) {
		this.seuNumero = seuNumero;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public String getNumeroBancoRet() {
		return numeroBancoRet;
	}

	public void setNumeroBancoRet(String numeroBancoRet) {
		this.numeroBancoRet = numeroBancoRet;
	}

	public String getOcorrrencias() {
		return ocorrrencias;
	}

	public void setOcorrrencias(String ocorrrencias) {
		this.ocorrrencias = ocorrrencias;
	}

}
