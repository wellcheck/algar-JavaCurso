package com.algarworks.curso.strings;

public class ExemploString8 {

	public static void main(String[] args) {
		String s = "Java";

		// Procura o indice onde o caracter está na primeira posição
		int indice = s.indexOf('a');
		
		System.out.println(indice);

		// Procura o indice do caracter na ultima posição
		indice = s.lastIndexOf('a');
		System.out.println(indice);
	}

}
