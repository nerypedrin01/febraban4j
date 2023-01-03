package br.com.pedro.febraban4j.domain;

import java.util.List;

public class Arquivo {

	private HeaderArquivo headerArquivo;
	private List<Lote> lotes;
	private TrailerArquivo triller;

	public Arquivo(HeaderArquivo headerArquivo, List<Lote> lotes, TrailerArquivo triller) {
		this.headerArquivo = headerArquivo;
		this.lotes = lotes;
		this.triller = triller;
	}

	public Arquivo() {
		// TODO Auto-generated constructor stub
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public TrailerArquivo getTriller() {
		return triller;
	}

	public void setTriller(TrailerArquivo triller) {
		this.triller = triller;
	}

	public HeaderArquivo getHeaderArquivo() {
		return headerArquivo;
	}

	public void setHeaderArquivo(HeaderArquivo headerArquivo) {
		this.headerArquivo = headerArquivo;
	}

	@Override
	public String toString() {
		return "Arquivo [headerAruivo=" + headerArquivo + ", lotes=" + lotes + ", triller=" + triller + "]";
	}

}
