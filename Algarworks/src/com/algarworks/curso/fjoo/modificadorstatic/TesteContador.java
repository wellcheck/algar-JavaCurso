package com.algarworks.curso.fjoo.modificadorstatic;

public class TesteContador {
	
	public static void main(String[] args) {
		Contador.count++;
		
		int ValorCount = Contador.count;
		
		System.out.println("O valor da variavel é:" + ValorCount);
		
	}

}
