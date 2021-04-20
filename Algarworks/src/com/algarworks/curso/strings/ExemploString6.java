package com.algarworks.curso.strings;

public class ExemploString6 {

	public static void main(String[] args) {
		String s = "    Wellington     ";

		System.out.println(">" + s + "<");

		// Maneira de retirar os espaços de dentro da String
		System.out.println(">" + s.trim() + "<");

	}
}