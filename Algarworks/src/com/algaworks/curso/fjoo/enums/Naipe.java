package com.algaworks.curso.fjoo.enums;

public enum Naipe {
	
	// Somente esses 4 valores definidos.
	
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	Naipe(String cor){
		this.cor = cor;
	}
	
	private String cor;
	
	public String getCor() {
		return cor;
	}

}
