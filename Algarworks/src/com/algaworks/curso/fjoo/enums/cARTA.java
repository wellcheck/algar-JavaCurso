package com.algaworks.curso.fjoo.enums;

public class cARTA {

	private int numero;
	private Naipe naipe;
	
	public cARTA(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public void imprimirCarta() {
		System.out.println("Sou o " + numero + " de " + naipe + " e tenho a cor " + naipe.getCor());
	}
}
