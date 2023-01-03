package br.com.pedro.febraban4j.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

	private static DecimalFormat decimal2d = new DecimalFormat("0.00");
	private static SimpleDateFormat dataFormater = new SimpleDateFormat("ddMMyyyy");
	private static SimpleDateFormat horaFormater = new SimpleDateFormat("hhmmss");
	
	public static Integer dateToInt(Date data) {
		return Integer.parseInt(dataFormater.format(data));	
	}

	public static Integer timeToInt(Date time) {
		return Integer.parseInt(horaFormater.format(time));	
	}

	public static Integer bdToInt(BigDecimal vlr) {
		return Integer.parseInt(decimal2d.format(vlr).replace(",", ""));
	}
}
