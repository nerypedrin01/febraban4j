package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

/**
 * <h2>Segmento Obrigátorio.Pagamentos através de PIX Transferência</h2> </br>
 * <b> Todos os atributos com 'Ret' no final são atributos de retorno. </br>
 * Preenchê-los com '0' se for númericos ou com um espaço em branco ex: " " se
 * for caracteres. </b> </br>
 * </br>
 * 
 * @author Pedro
 * 
 */
public class SegmentoBO implements Segmentos{
	@FebrabanPostion(tamanho = 3)
	private int codigoBanco;

	@FebrabanPostion(tamanho = 4)
	private int codigoLote;

	@FebrabanPostion(tamanho = 1)
	private int tipoRegistro;

	@FebrabanPostion(tamanho = 5)
	private int numeroRegistro;

	@FebrabanPostion(tamanho = 1)
	private String codigoSegmento;

	@FebrabanPostion(tamanho = 2)
	private String tipoChave;

	@FebrabanPostion(tamanho = 1)
	private String brancos;

	@FebrabanPostion(tamanho = 1)
	private int tipoInscricao;

	@FebrabanPostion(tamanho = 14)
	private int empresaInscricao;

	@FebrabanPostion(tamanho = 30)
	private String txid;

	@FebrabanPostion(tamanho = 30)
	private int infoAndUser;

	@FebrabanPostion(tamanho = 100)
	private String chavePix;

	@FebrabanPostion(tamanho = 3)
	private String brancos2;

	@FebrabanPostion(tamanho = 10)
	private String ocorrenciasRet;

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

	public String getTipoChave() {
		return tipoChave;
	}

	public void setTipoChave(String tipoChave) {
		this.tipoChave = tipoChave;
	}

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public int getTipoInscricao() {
		return tipoInscricao;
	}

	public void setTipoInscricao(int tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	public int getEmpresaInscricao() {
		return empresaInscricao;
	}

	public void setEmpresaInscricao(int empresaInscricao) {
		this.empresaInscricao = empresaInscricao;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public int getInfoAndUser() {
		return infoAndUser;
	}

	public void setInfoAndUser(int infoAndUser) {
		this.infoAndUser = infoAndUser;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public String getBrancos2() {
		return brancos2;
	}

	public void setBrancos2(String brancos2) {
		this.brancos2 = brancos2;
	}

	public String getOcorrencias() {
		return ocorrenciasRet;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrenciasRet = ocorrencias;
	}

}
