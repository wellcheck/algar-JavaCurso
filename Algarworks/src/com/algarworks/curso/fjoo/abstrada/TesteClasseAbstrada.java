package com.algarworks.curso.fjoo.abstrada;

public class TesteClasseAbstrada {

	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "31/08/2022";
		
		p.descricaoProduto();
		

	}

}
