package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

/**
 * <h2>Segmento Obrigátorio.Pagamentos de Salários através de crédito em conta
 * corrente</h2> </br>
 * <b> Todos os atributos com 'Ret' no final são atributos de retorno. </br>
 * Preenchê-los com '0' se for númericos ou com um espaço em branco ex: " " se
 * for caracteres. </b> </br>
 * </br>
 * 
 * @author Pedro
 * 
 */
public class SegmentoE  implements Segmentos{

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

	@FebrabanPostion(tamanho = 3)
	private String brancos;

	@FebrabanPostion(tamanho = 1)
	private String movimento;

	@FebrabanPostion(tamanho = 200)
	private String informacoesComplementares;

	@FebrabanPostion(tamanho = 12)
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

	public String getBrancos() {
		return brancos;
	}

	public void setBrancos(String brancos) {
		this.brancos = brancos;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	public String getInformacoesComplementares() {
		return informacoesComplementares;
	}

	public void setInformacoesComplementares(String informacoesComplementares) {
		this.informacoesComplementares = informacoesComplementares;
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
