package com.algarworks.curso.fjoo.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		//Traz a data atual.
		Date hoje = new Date();
		System.out.println(hoje);

		//Essa parte formata a data da variavel "hoje" do modo que preferirmos!
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
		
		String dataAniversario = "31/08/1991";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");// É uma excessão checada por isso precisa do Try Catch.
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data invalido!");
		}
	}

}
