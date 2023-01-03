package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;

public class TrailerArquivo {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 9)
	private String brancos;

	@FebrabanPostion(tamanho = 6)
	private Integer totalLotesArquivos;

	@FebrabanPostion(tamanho = 6)
	private Integer totalRegistroArqv;

	@FebrabanPostion(tamanho = 211)
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

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public Integer getTotalLotesArquivos() {
		return totalLotesArquivos;
	}

	public void setTotalLotesArquivos(Integer totalLotesArquivos) {
		this.totalLotesArquivos = totalLotesArquivos;
	}

	public Integer getTotalRegistroArqv() {
		return totalRegistroArqv;
	}

	public void setTotalRegistroArqv(Integer totalRegistroArqv) {
		this.totalRegistroArqv = totalRegistroArqv;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

}
