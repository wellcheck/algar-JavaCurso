package com.algarworks.curso.strings;

public class ExemplosString {

	public static void main(String[] args) {
		String nome = "Pedro";

		// Aqui foi criada uma outra variavel.
		System.out.println(nome.toUpperCase());

		// Na verdade a variavel nome nunca mudou, pelo fato dela ser imutavel.
		System.out.println(nome);

		nome = nome.toUpperCase();
		System.out.println(nome);

		// ---------------------------------------------------------------------------------//

		String s1 = "Pedro";
		String s2 = "Pedro";

		System.out.println("As variaveis s1 == s2 " + (s1 == s2));
		
		String s3 = new String("Pedro");
		
		System.out.println("s1 == s3 " + (s1 == s3));
		
		//Compara a Strings pelo metodo equals 
		System.out.println("s1 equals s3" + s1.equals(s3));
		System.out.println("s3 equals s1" + s3.equals(s1));
	
	
		String s4 = "PeDrO";
		
		System.out.println("s4 equals s1" + s4.equals(s1));
		
		//Ignora o tamanho das letras, só checa a informação.
		System.out.println("s4 equals ignote case " +s4.equalsIgnoreCase(s1));
	}

}
