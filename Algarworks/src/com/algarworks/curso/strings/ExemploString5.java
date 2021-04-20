package com.algarworks.curso.strings;

public class ExemploString5 {

	public static void main(String[] args) {
		// public String substring(int beginIndex)
		// public String substring(int beginIndex, int endingIndex)
	
		//Está imprimindo a partir da posição 16
		String s = "Desenvolvimento Java";
		System.out.println(s.substring(16));
	
		String sg = "Cursos online de desenvolvimento de software";
		System.out.println(sg.substring(7, 12));
	}

}
