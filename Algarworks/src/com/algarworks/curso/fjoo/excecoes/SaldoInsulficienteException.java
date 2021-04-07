package com.algarworks.curso.fjoo.excecoes;

public class SaldoInsulficienteException extends Exception {
	
	public SaldoInsulficienteException(String mensagem) {  // Cria um construtor para enviar mensagens.
		super(mensagem); // Chamar o construtor da super classe Exception para passar a mensagem como parametro
	}

}
