package com.algarworks.curso.strings;

public class ExemploString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_software_Wellington";

		// Metodo para retirar o "_" e alocar cada palavra em uma posição do array.
		String[] array = s.split("_"); // Aqui coloca a String em um array e retira o "_"
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]" + array[i]);
		}
	}

}
