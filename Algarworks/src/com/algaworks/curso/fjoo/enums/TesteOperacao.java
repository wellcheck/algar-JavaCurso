package com.algaworks.curso.fjoo.enums;

public class TesteOperacao {
	public static void main(String[] args) {
		OperacaoAritmetica op = OperacaoAritmetica.ADICAO;

		int resultado1 = op.operacao(5, 3);

		System.out.println("O resultado é: " + resultado1);

		// For para percorrer um Enum
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " --> " + oa.operacao(4, 9));
		}
	}

}
