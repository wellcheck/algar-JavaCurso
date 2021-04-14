package com.algarworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00"); // Passar o parametro para o construtor, para
																		// colocar no padrão da moeda Real
		double valorProduto = 1300.59;

		System.out.println(valorProduto); // Sem formatador.
		System.out.println(formatador.format(valorProduto)); // Com a formatação.

		String entrada = "R$ 50,39";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println(numero);
		} catch (ParseException e) {
			System.out.println("Entrada de numeros invalidos!");
		}

		//Classe usada para grandes operações tendo capacidade maior que o double.
		BigDecimal bd = new BigDecimal(543323452d); // Precisa colocar o d no construtor para informar que é um numero descimal.
		bd = bd.divide(BigDecimal.valueOf(50));
		System.out.println(bd);
	}

}
