package com.algarworks.curso.fjoo.excecoes;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor que 0"); // Esse tipo de Exception é
																					// utilizada para reparar erros
																					// basicos de lógica de programação,
																					// como dividir 5 / 0;
		}

		this.saldo += deposito;
	}

	public void sacar(double quantidade) throws SaldoInsulficienteException { // É necessario colocar o Throws para
																				// exceções checada, utilizada para
																				// regras de negócio!!
		double saldoTemp = saldo - quantidade;
		if (saldoTemp < 0) {
			throw new SaldoInsulficienteException("Você não tem saldo o suficiente!");
		}
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
