package com.algarworks.curso.fjoo.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();

		//Pela classe Calendar podemos atribuir dias, meses, anos, horas, minutos e segundos.a
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.YEAR, 1991);
		c.set(Calendar.HOUR_OF_DAY, 6);
		c.set(Calendar.MINUTE, 10);
		c.set(Calendar.SECOND, 0);

		//Formata para mostrar na tela.
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));

		//Adicionando mais um dia.
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
	}

}
