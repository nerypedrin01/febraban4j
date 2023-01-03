package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;

public class RegistroTrailerLote {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 9)
	private String brancos;

	@FebrabanPostion(tamanho = 6)
	private Integer totalQtdRegistro;

	@FebrabanPostion(tamanho = 18)
	private Integer totalValorPagamentos;

	@FebrabanPostion(tamanho = 18)
	private Integer zeros;

	@FebrabanPostion(tamanho = 171)
	private String brancos2;

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

	public Integer getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(Integer tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public Integer getTotalQtdRegistro() {
		return totalQtdRegistro;
	}

	public void setTotalQtdRegistro(Integer totalQtdRegistro) {
		this.totalQtdRegistro = totalQtdRegistro;
	}

	public Integer getTotalValorPagamentos() {
		return totalValorPagamentos;
	}

	public void setTotalValorPagamentos(Integer totalValorPagamentos) {
		this.totalValorPagamentos = totalValorPagamentos;
	}

	public Integer getZeros() {
		return zeros;
	}

	public void setZeros(Integer zeros) {
		this.zeros = zeros;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getOcorrenciasRet() {
		return ocorrenciasRet;
	}

	public void setOcorrenciasRet(String ocorrenciasRet) {
		this.ocorrenciasRet = ocorrenciasRet;
	}

}
