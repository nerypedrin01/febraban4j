package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoF implements Segmentos {

	@FebrabanPostion(tamanho = 3)
	private Integer codBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroDoRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codigoSegmento;

	@FebrabanPostion(tamanho = 03)
	private String brancos;

	@FebrabanPostion(tamanho = 144)
	private String mensagemInformações;

	@FebrabanPostion(tamanho = 69)
	private String brancos2;

	@FebrabanPostion(tamanho = 10)
	private String ocorrencias;

	public Integer getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(Integer codBanco) {
		this.codBanco = codBanco;
	}

	public Integer getCodLote() {
		return codLote;
	}

	public void setCodLote(Integer codLote) {
		this.codLote = codLote;
	}

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public Integer getNumeroDoRegistro() {
		return numeroDoRegistro;
	}

	public void setNumeroDoRegistro(Integer numeroDoRegistro) {
		this.numeroDoRegistro = numeroDoRegistro;
	}

	public String getCodigoSegmento() {
		return codigoSegmento;
	}

	public void setCodigoSegmento(String codigoSegmento) {
		this.codigoSegmento = codigoSegmento;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public String getMensagemInformações() {
		return mensagemInformações;
	}

	public void setMensagemInformações(String mensagemInformações) {
		this.mensagemInformações = mensagemInformações;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	
	
}