package com.algarworks.curso.strings;

public class ExemploString9 {

	public static void main(String[] args) {
		String s = "Desenvolvimento java";
		// Assim pode ser substituido o "java" para "de software", sempre lembrando que
		// a palavra que ira ser substituida precisa ser indentica a da declarada na
		// variavel.
		System.out.println(s.replaceAll("java", "de software"));

	}

}
