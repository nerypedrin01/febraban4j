package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;

public class HeaderLote {

	@FebrabanPostion(tamanho = 3)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 1)
	private String tipoOperacao;

	@FebrabanPostion(tamanho = 2)
	private Integer tipoPagamento;

	@FebrabanPostion(tamanho = 2)
	private Integer formaPamento;

	@FebrabanPostion(tamanho = 3)
	private Integer layoutLote;

	@FebrabanPostion(tamanho = 1)
	private String brancos;

	@FebrabanPostion(tamanho = 1)
	private Integer tipoInscricao;

	@FebrabanPostion(tamanho = 14)
	private Long inscricaoEmpresa;

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
	private String finalidadeLote;

	@FebrabanPostion(tamanho = 10)
	private String historicoContaCorrente;

	@FebrabanPostion(tamanho = 30)
	private String enderecoEmpresa;

	@FebrabanPostion(tamanho = 5)
	private Integer numeroEndereco;

	@FebrabanPostion(tamanho = 15)
	private String complemento;

	@FebrabanPostion(tamanho = 20)
	private String nomeCidade;

	@FebrabanPostion(tamanho = 8)
	private Integer cep;

	@FebrabanPostion(tamanho = 2)
	private String uf;

	@FebrabanPostion(tamanho = 8)
	private String brancos5;

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

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Integer getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(Integer tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Integer getFormaPamento() {
		return formaPamento;
	}

	public void setFormaPamento(Integer formaPamento) {
		this.formaPamento = formaPamento;
	}

	public Integer getLayoutLote() {
		return layoutLote;
	}

	public void setLayoutLote(Integer layoutLote) {
		this.layoutLote = layoutLote;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public Integer getTipoInscricao() {
		return tipoInscricao;
	}

	public void setTipoInscricao(Integer tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	public Long getInscricaoEmpresa() {
		return inscricaoEmpresa;
	}

	public void setInscricaoEmpresa(Long inscricaoEmpresa) {
		this.inscricaoEmpresa = inscricaoEmpresa;
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

	public String getFinalidadeLote() {
		return finalidadeLote;
	}

	public void setFinalidadeLote(String finalidadeLote) {
		this.finalidadeLote = finalidadeLote;
	}

	public String getHistoricoContaCorrente() {
		return historicoContaCorrente;
	}

	public void setHistoricoContaCorrente(String historicoContaCorrente) {
		this.historicoContaCorrente = historicoContaCorrente;
	}

	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public Integer getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(Integer numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBrancos5() {
		return brancos5;
	}

	public void setBrancos5(String brancos5) {
		this.brancos5 = brancos5;
	}

	public String getOcorrenciasRet() {
		return ocorrenciasRet;
	}

	public void setOcorrenciasRet(String ocorrenciasRet) {
		this.ocorrenciasRet = ocorrenciasRet;
	}

}
