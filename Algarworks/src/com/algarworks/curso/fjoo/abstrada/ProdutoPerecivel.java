package com.algarworks.curso.fjoo.abstrada;

public class ProdutoPerecivel extends Produto {

	
	String dataValidade; // Por enquanto at� aprendermos a classe Dater
	
	@Override
	public void descricaoProduto() {
		System.out.println("Descri��o: " + super.getDescricao() + "Data de validade: " + dataValidade);
		
		
	}

}
