package com.algarworks.curso.strings;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		// Uma variavel multavel ou seja ela permiti alterar ela, diferente de uma
		// classe imultavel que não é permitido alteração.
		StringBuffer sb = new StringBuffer();

		// --------------------------------------------------------
		// Assim é feito para concatenar String.
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas duvidas. ");
		sb.append("Estamos aqui para ajudar. ");

		System.out.println(sb.toString());

		sb.insert(26, " da AlgarWorks");
		
		System.out.println(sb);
	}

}
