package com.algarworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fosforo";
		pp.dataValidade = new Date();
		pp.indentificar();
	}

}
