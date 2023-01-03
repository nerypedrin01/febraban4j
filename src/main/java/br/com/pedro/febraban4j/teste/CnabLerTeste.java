package br.com.pedro.febraban4j.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.pedro.febraban4j.domain.Arquivo;
import br.com.pedro.febraban4j.excepion.Febraban4jException;
import br.com.pedro.febraban4j.util.Febranator;

public class CnabLerTeste {
	public static void main(String[] args) throws IOException, Febraban4jException {

		Febranator febranator = new Febranator();

		List<String> linhas = getArquivo();
		System.out.println("numeros linhas " + linhas.size());
		Arquivo arquivo = febranator.fromString(linhas);

		System.out.println(arquivo.toString());
	}

	private static List<String> getArquivo() throws FileNotFoundException, IOException {

		List<String> linhas = new ArrayList<String>();
		FileReader arq = new FileReader(new File("C:/Users/Pedro/Desktop/modelo.txt"));
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		while (linha != null) {
			linhas.add(linha);
			linha = lerArq.readLine();
		}
		arq.close();
		return linhas;
	}
}
