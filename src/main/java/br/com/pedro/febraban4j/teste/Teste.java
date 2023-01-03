package br.com.pedro.febraban4j.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Teste {

	public static void main(String[] args) throws ParseException {

		Date date = setDate();
		DateFormat dateFormat = DateFormat.getDateInstance();
		String s = dateFormat.format(date);
		System.out.println(s);
	}

	private static Date setDate() {

		Integer vencimento = 9165;
		Date date = new Date();
		date.setTime(date.getTime() + (vencimento * 24 * 60 * 60 * 1000));

		return date;

	}
}
