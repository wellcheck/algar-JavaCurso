package com.algarworks.curso.strings;

public class TesteStrings {

	public static void main(String[] args) {
		//String, StringBuilder e StringBuffer
		
		String s = "Ola"; // Essa String está na memória.
		s = s + " Pessoal"; // Criada String "ola Pessoal".
		
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Ola");
		sb.append(" Pessoal");
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
		
	}

}
