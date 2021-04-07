package com.algarworks.curso.fjoo.matematica;

public class TesteClasseMath {

	public static void main(String[] args) {
		// Comprimento de uma circunferencia 2 * r * Pi
		int raio = 4;
		double comprimento = 2 * raio * Math.PI;
		System.out.println("O comprimento: " + comprimento);
		
		// Maximo e minimo
		double[] precoProduto = {30.20 , 25.80};
		double maiorPreco = Math.max(precoProduto[0], precoProduto[1]);
		System.out.println("O maior preço é: " + maiorPreco);
		
		// Potencia
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// Raiz quadrada
		System.out.println("A raiz de 9: " + Math.sqrt(9));
		
		// Arredondamento ceil, floor e round
		double n = 5.68;
		System.out.println("O menor numero: " + Math.floor(n));
		System.out.println("O maior numero: " + Math.ceil(n));
		System.out.println("Round: " + Math.round(n));

	}

}
