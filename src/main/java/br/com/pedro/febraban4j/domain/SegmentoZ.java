package br.com.pedro.febraban4j.domain;

import br.com.pedro.febraban4j.annotation.FebrabanPostion;
import br.com.pedro.febraban4j.interfaces.Segmentos;

public class SegmentoZ implements Segmentos {

	@FebrabanPostion(tamanho = 03)
	private Integer codigoBanco;

	@FebrabanPostion(tamanho = 04)
	private Integer codigoLote;

	@FebrabanPostion(tamanho = 01)
	private Integer tipoRegistro;

	@FebrabanPostion(tamanho = 05)
	private Integer numeroRegistro;

	@FebrabanPostion(tamanho = 01)
	private String codigoSegmento;

	@FebrabanPostion(tamanho = 64)
	private String autenticacao;

	@FebrabanPostion(tamanho = 20)
	private String seuNumero;

	@FebrabanPostion(tamanho = 05)
	private String brancos;

	@FebrabanPostion(tamanho = 15)
	private String numeroBanco;

	@FebrabanPostion(tamanho = 122)
	private String brancos2;
}