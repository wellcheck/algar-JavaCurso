package com.algarworks.curso.strings;

public class ExemploString8 {

	public static void main(String[] args) {
		String s = "Java";

		// Procura o indice onde o caracter est� na primeira posi��o
		int indice = s.indexOf('a');
		
		System.out.println(indice);

		// Procura o indice do caracter na ultima posi��o
		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}

}
