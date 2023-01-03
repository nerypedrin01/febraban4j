package br.com.pedro.febraban4j.domain;

import java.util.List;

import br.com.pedro.febraban4j.interfaces.Segmentos;

public class Lote {

	private HeaderLote headerLote;
	private List<Segmentos> segmentos;
	private RegistroTrailerLote registroTrailerLote;

	public Lote(HeaderLote headerLote, List<Segmentos> segmentos, RegistroTrailerLote registroTrailerLote) {
		this.headerLote = headerLote;
		this.segmentos = segmentos;
		this.registroTrailerLote = registroTrailerLote;
	}

	public Lote() {

	}

	public HeaderLote getHeaderLote() {
		return headerLote;
	}

	public void setHeaderLote(HeaderLote headerLote) {
		this.headerLote = headerLote;
	}

	public List<Segmentos> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(List<Segmentos> segmentos) {
		this.segmentos = segmentos;
	}

	public RegistroTrailerLote getRegistroTrailerLote() {
		return registroTrailerLote;
	}

	public void setRegistroTrailerLote(RegistroTrailerLote registroTrailerLote) {
		this.registroTrailerLote = registroTrailerLote;
	}

}
