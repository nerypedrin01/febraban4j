package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoJ52 implements Segmentos {

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

	@FebrabanPostion(tamanho = 2)
	private Integer codigoRegistro;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoInscricaoSacado;

	@FebrabanPostion(tamanho = 15)
	private Integer numeroSacado;

	@FebrabanPostion(tamanho = 40)
	private String nomeSacado;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoInscricaoCedente;

	@FebrabanPostion(tamanho = 15)
	private Integer numeroCedente;

	@FebrabanPostion(tamanho = 40)
	private String nomeCedente;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoSacador;

	@FebrabanPostion(tamanho = 15)
	private Integer nuemroSacador;

	@FebrabanPostion(tamanho = 40)
	private String nomeSacador;

	@FebrabanPostion(tamanho = 53)
	private String brancos;

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

	public Integer getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(Integer codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public Integer getTipoInscricaoSacado() {
		return tipoInscricaoSacado;
	}

	public void setTipoInscricaoSacado(Integer tipoInscricaoSacado) {
		this.tipoInscricaoSacado = tipoInscricaoSacado;
	}

	public Integer getNumeroSacado() {
		return numeroSacado;
	}

	public void setNumeroSacado(Integer numeroSacado) {
		this.numeroSacado = numeroSacado;
	}

	public String getNomeSacado() {
		return nomeSacado;
	}

	public void setNomeSacado(String nomeSacado) {
		this.nomeSacado = nomeSacado;
	}

	public Integer getTipoInscricaoCedente() {
		return tipoInscricaoCedente;
	}

	public void setTipoInscricaoCedente(Integer tipoInscricaoCedente) {
		this.tipoInscricaoCedente = tipoInscricaoCedente;
	}

	public Integer getNumeroCedente() {
		return numeroCedente;
	}

	public void setNumeroCedente(Integer numeroCedente) {
		this.numeroCedente = numeroCedente;
	}

	public String getNomeCedente() {
		return nomeCedente;
	}

	public void setNomeCedente(String nomeCedente) {
		this.nomeCedente = nomeCedente;
	}

	public Integer getTipoSacador() {
		return tipoSacador;
	}

	public void setTipoSacador(Integer tipoSacador) {
		this.tipoSacador = tipoSacador;
	}

	public Integer getNuemroSacador() {
		return nuemroSacador;
	}

	public void setNuemroSacador(Integer nuemroSacador) {
		this.nuemroSacador = nuemroSacador;
	}

	public String getNomeSacador() {
		return nomeSacador;
	}

	public void setNomeSacador(String nomeSacador) {
		this.nomeSacador = nomeSacador;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

}