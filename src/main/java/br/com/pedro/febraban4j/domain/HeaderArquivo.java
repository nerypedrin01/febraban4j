package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;

public class HeaderArquivo {

	@FebrabanPostion(tamanho = 3)
	private Integer codigBanco;
	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;
	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;
	@FebrabanPostion(tamanho = 6)
	private String brancos1;
	@FebrabanPostion(tamanho = 3)
	private Integer layoutArquivo;
	@FebrabanPostion(tamanho = 1)
	private Integer tipoInscricao;
	@FebrabanPostion(tamanho = 14)
	private Long numeroInscricao;
	@FebrabanPostion(tamanho = 20)
	private String brancos2;
	@FebrabanPostion(tamanho = 5)
	private Integer agencia;
	@FebrabanPostion(tamanho = 1)
	private String brancos3;
	@FebrabanPostion(tamanho = 12)
	private Integer conta;

	@FebrabanPostion(tamanho = 1)
	private String brancos4;

	@FebrabanPostion(tamanho = 1)
	private Integer dac;
	@FebrabanPostion(tamanho = 30)
	private String nomeEmpresa;
	@FebrabanPostion(tamanho = 30)
	private String nomeBanco;
	@FebrabanPostion(tamanho = 10)
	private String brancos5;
	@FebrabanPostion(tamanho = 1)
	private Integer codigoRT;
	@FebrabanPostion(tamanho = 8)
	private Integer dataCadastro;
	@FebrabanPostion(tamanho = 6)
	private Integer horaCadastro;
	@FebrabanPostion(tamanho = 9)
	private Integer zeros;
	@FebrabanPostion(tamanho = 5)
	private Integer unidadeDensidade;
	@FebrabanPostion(tamanho = 69)
	private String brancos6;

	public Integer getCodigBanco() {
		return codigBanco;
	}

	public void setCodigBanco(Integer codigBanco) {
		this.codigBanco = codigBanco;
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

	public String getBrancos1() {
		return brancos1;
	}

	public void setBrancos1(String brancos1) {
		this.brancos1 = brancos1;
	}

	public Integer getLayoutArquivo() {
		return layoutArquivo;
	}

	public void setLayoutArquivo(Integer layoutArquivo) {
		this.layoutArquivo = layoutArquivo;
	}

	public Integer getTipoInscricao() {
		return tipoInscricao;
	}

	public void setTipoInscricao(Integer tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	public Long getNumeroInscricao() {
		return numeroInscricao;
	}

	public void setNumeroInscricao(Long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getBrancos3() {
		return brancos3;
	}

	public void setBrancos3(String brancos3) {
		this.brancos3 = brancos3;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getBrancos4() {
		return brancos4;
	}

	public void setBrancos4(String brancos4) {
		this.brancos4 = brancos4;
	}

	public Integer getDac() {
		return dac;
	}

	public void setDac(Integer dac) {
		this.dac = dac;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getBrancos5() {
		return brancos5;
	}

	public void setBrancos5(String brancos5) {
		this.brancos5 = brancos5;
	}

	public Integer getCodigoRT() {
		return codigoRT;
	}

	public void setCodigoRT(Integer codigoRT) {
		this.codigoRT = codigoRT;
	}

	public Integer getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Integer dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(Integer horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public Integer getZeros() {
		return zeros;
	}

	public void setZeros(Integer zeros) {
		this.zeros = zeros;
	}

	public Integer getUnidadeDensidade() {
		return unidadeDensidade;
	}

	public void setUnidadeDensidade(Integer unidadeDensidade) {
		this.unidadeDensidade = unidadeDensidade;
	}

	public String getBrancos6() {
		return brancos6;
	}

	public void setBrancos6(String brancos6) {
		this.brancos6 = brancos6;
	}

	@Override
	public String toString() {
		return codigBanco + +codigoLote + +tipoRegistro + brancos1 + layoutArquivo + tipoInscricao + numeroInscricao
				+ brancos2 + agencia + brancos3 + conta + dac + nomeEmpresa + nomeBanco + brancos4 + codigoRT
				+ dataCadastro + horaCadastro + unidadeDensidade + brancos5;
	}

}
