package com.algarworks.curso.fjoo.heranca;

public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga?" + aindaJoga);
	}
}
