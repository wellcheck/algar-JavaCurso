package com.algarworks.curso.fjoo.abstrada;

public class ProdutoPerecivel extends Produto {

	
	String dataValidade; // Por enquanto até aprendermos a classe Dater
	
	@Override
	public void descricaoProduto() {
		System.out.println("Descrição: " + super.getDescricao() + "Data de validade: " + dataValidade);
		
		
	}

}
