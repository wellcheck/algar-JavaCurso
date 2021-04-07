package com.algarworks.curso.fjoo.excecoes;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor n�o pode ser menor que 0"); // Esse tipo de Exception �
																					// utilizada para reparar erros
																					// basicos de l�gica de programa��o,
																					// como dividir 5 / 0;
		}

		this.saldo += deposito;
	}

	public void sacar(double quantidade) throws SaldoInsulficienteException { // � necessario colocar o Throws para
																				// exce��es checada, utilizada para
																				// regras de neg�cio!!
		double saldoTemp = saldo - quantidade;
		if (saldoTemp < 0) {
			throw new SaldoInsulficienteException("Voc� n�o tem saldo o suficiente!");
		}
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
