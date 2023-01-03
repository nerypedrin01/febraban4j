package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

/**
 * <h2>Segmento Obrigátorio. Pagamentos através de cheque, OP, DOC, TED, PIX
 * Transferência e crédito em conta corrente</h2> </br>
 * <b> Todos os atributos com 'Ret' no final são atributos de retorno. </br>
 * Preenchê-los com '0' se for númericos ou com um espaço em branco ex: " " se
 * for caracteres. </b> </br>
 * </br>
 * 
 * @author Pedro
 * 
 */
public class SegmentoAO implements Segmentos {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer registroLote;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codSegmento;

	@FebrabanPostion(tamanho = 3)
	private Integer tipoMovimento;

	@FebrabanPostion(tamanho = 3)
	private Integer camera;

	@FebrabanPostion(tamanho = 3)
	private Integer bancoFavorecido;

	@FebrabanPostion(tamanho = 20)
	private String agenciaContaFav;

	@FebrabanPostion(tamanho = 30)
	private String nomeFavorecido;

	@FebrabanPostion(tamanho = 20)
	private String numeroDoc;

	@FebrabanPostion(tamanho = 8)
	private Integer dataDePagamento;

	@FebrabanPostion(tamanho = 3)
	private String moeda;

	@FebrabanPostion(tamanho = 8)
	private String codigoISPB;

	@FebrabanPostion(tamanho = 2)
	private String identificacaoTransferencia;

	@FebrabanPostion(tamanho = 5)
	private Integer zeros;

	@FebrabanPostion(tamanho = 15)
	private Integer valorPagamento;

	@FebrabanPostion(tamanho = 15)
	private String numeroBancoRet;

	@FebrabanPostion(tamanho = 5)
	private String brancos;

	@FebrabanPostion(tamanho = 8)
	private Integer dataEfetivaRet;

	@FebrabanPostion(tamanho = 15)
	private Integer valotEfetivoRet;

	@FebrabanPostion(tamanho = 20)
	private String finalidadeDetalhe;

	@FebrabanPostion(tamanho = 6)
	private String numeroDocRet;

	@FebrabanPostion(tamanho = 14)
	private Long numeroInscricao;

	@FebrabanPostion(tamanho = 2)
	private String finalidadeDocumento;

	@FebrabanPostion(tamanho = 5)
	private String finalidadeTed;

	@FebrabanPostion(tamanho = 5)
	private String brancos2;

	@FebrabanPostion(tamanho = 1)
	private String aviso;

	@FebrabanPostion(tamanho = 10)
	private String ocorrenciasRet;

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

	public Integer getRegistroLote() {
		return registroLote;
	}

	public void setRegistroLote(Integer registroLote) {
		this.registroLote = registroLote;
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

	public Integer getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(Integer tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Integer getCamera() {
		return camera;
	}

	public void setCamera(Integer camera) {
		this.camera = camera;
	}

	public Integer getBancoFavorecido() {
		return bancoFavorecido;
	}

	public void setBancoFavorecido(Integer bancoFavorecido) {
		this.bancoFavorecido = bancoFavorecido;
	}

	public String getAgenciaContaFav() {
		return agenciaContaFav;
	}

	public void setAgenciaContaFav(String agenciaContaFav) {
		this.agenciaContaFav = agenciaContaFav;
	}

	public String getNomeFavorecido() {
		return nomeFavorecido;
	}

	public void setNomeFavorecido(String nomeFavorecido) {
		this.nomeFavorecido = nomeFavorecido;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public Integer getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Integer dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getCodigoISPB() {
		return codigoISPB;
	}

	public void setCodigoISPB(String codigoISPB) {
		this.codigoISPB = codigoISPB;
	}

	public String getIdentificacaoTransferencia() {
		return identificacaoTransferencia;
	}

	public void setIdentificacaoTransferencia(String identificacaoTransferencia) {
		this.identificacaoTransferencia = identificacaoTransferencia;
	}

	public Integer getZeros() {
		return zeros;
	}

	public void setZeros(Integer zeros) {
		this.zeros = zeros;
	}

	public Integer getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Integer valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public String getNumeroBancoRet() {
		return numeroBancoRet;
	}

	public void setNumeroBancoRet(String numeroBancoRet) {
		this.numeroBancoRet = numeroBancoRet;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public Integer getDataEfetivaRet() {
		return dataEfetivaRet;
	}

	public void setDataEfetivaRet(Integer dataEfetivaRet) {
		this.dataEfetivaRet = dataEfetivaRet;
	}

	public Integer getValotEfetivoRet() {
		return valotEfetivoRet;
	}

	public void setValotEfetivoRet(Integer valotEfetivoRet) {
		this.valotEfetivoRet = valotEfetivoRet;
	}

	public String getFinalidadeDetalhe() {
		return finalidadeDetalhe;
	}

	public void setFinalidadeDetalhe(String finalidadeDetalhe) {
		this.finalidadeDetalhe = finalidadeDetalhe;
	}

	public String getNumeroDocRet() {
		return numeroDocRet;
	}

	public void setNumeroDocRet(String numeroDocRet) {
		this.numeroDocRet = numeroDocRet;
	}

	public Long getNumeroInscricao() {
		return numeroInscricao;
	}

	public void setNumeroInscricao(Long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}

	public String getFinalidadeDocumento() {
		return finalidadeDocumento;
	}

	public void setFinalidadeDocumento(String finalidadeDocumento) {
		this.finalidadeDocumento = finalidadeDocumento;
	}

	public String getFinalidadeTed() {
		return finalidadeTed;
	}

	public void setFinalidadeTed(String finalidadeTed) {
		this.finalidadeTed = finalidadeTed;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getAviso() {
		return aviso;
	}

	public void setAviso(String aviso) {
		this.aviso = aviso;
	}

	public String getOcorrenciasRet() {
		return ocorrenciasRet;
	}

	public void setOcorrenciasRet(String ocorrenciasRet) {
		this.ocorrenciasRet = ocorrenciasRet;
	}

}
