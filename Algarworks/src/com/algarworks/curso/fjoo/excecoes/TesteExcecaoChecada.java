package com.algarworks.curso.fjoo.excecoes;

public class TesteExcecaoChecada {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.sacar(60);
		} catch (SaldoInsulficienteException e) {
			System.out.println("Desculpe, saldo insulficiente!");
		}
		System.out.println("Saldo: " + cc.getSaldo());

		try {
			cc.sacar(50);
		} catch (SaldoInsulficienteException e) {
			System.out.println("Desculpe, saldo insulficiente!");
		}

		finally {
			System.out.println("Obrigado por utilizar o nosso sistema!");
		}
		
		System.out.println("Saldo agora: " + cc.getSaldo());
	}

}
