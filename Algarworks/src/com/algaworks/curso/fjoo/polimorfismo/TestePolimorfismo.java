package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		// ------------------------------------------------------

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		//-------------------------------------------------------
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
		
		
	}

	// O instanceOf é usado para saber se uma determinado variavel é de um tipo expecifico. 
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());

		// Saber se o o bjeto do tipo "conta" é do tipo "ContaCorrente".
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da cc é: R$" + cc.getLimete() );
		}
		
		// Saber se o objeto do tipo "conta" é do tipo "ContaPoupanca".
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp é: R$" + cp.getRendimentos());
		}
		
	}

}
