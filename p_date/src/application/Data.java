package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("------------- UTC ------------------------");
		// Data Atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis()); // Data Atual
		Date x3 = new Date(0L); // 0 milisegundo
		Date x4 = new Date(1000L * 60L * 60L * 5L); // 5h milisegundo 
		
		Date y1 = sdf1.parse("25/06/2018");		
		Date y2 = sdf2.parse("25/06/2018 15:42:07");		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Formato ISO 8601 UTC
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf1.format(y2));		
		
		System.out.println("Y");
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));		
		System.out.println(sdf2.format(y3)); // padrão UTC (3h de atraso)


		System.out.println("X");
		System.out.println(sdf2.format(x1)); // Data Atual
		System.out.println(sdf2.format(x2)); // Data Atual		
		System.out.println(sdf2.format(x3));		
		System.out.println(sdf2.format(x4)); // Possui 3h de atraso
		
		System.out.println("------------- GMT ------------------------");
	
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));		
		
		System.out.println("Y");
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));		
		System.out.println(sdf3.format(y3)); // padrão GMT


		System.out.println("X");
		System.out.println(sdf3.format(x1)); // Data Atual
		System.out.println(sdf3.format(x2)); // Data Atual		
		System.out.println(sdf3.format(x3));		
		System.out.println(sdf3.format(x4)); // Possui 3h de atraso
		
		System.out.println("------------- ADICIONANDO UNIDADE DE TEMPO: DIA/HORA ------------------------");		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Formato ISO 8601 UTC	-3h
		System.out.println(sdf.format(d));
		
		// Adicionando 4 horas
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		// Obtendo os minutos
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d);
		int minutes = cal2.get(Calendar.MINUTE); // Minutos
		int month = cal2.get(Calendar.MONTH) + 1; // Month. +1 pois, o mês janeiro começa com ZERO(0).
		
		System.out.println("Minutes: " + minutes);		
		System.out.println("Month: " + month);


	}
}
