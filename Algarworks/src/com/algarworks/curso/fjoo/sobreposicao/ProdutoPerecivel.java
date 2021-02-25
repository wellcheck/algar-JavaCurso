package com.algarworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;

	public void indentificar() {
		//O comando super chama o metodo que tem o mesmo nome da superclasse mesmo eles tendo o mesmo nome.
		super.indentificar();
		System.out.println("Minha data de validae é: " + dataValidade);
	}

}
