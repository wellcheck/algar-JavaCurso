package com.algarworks.caixa;

import com.algarworks.impressora.Imprimivel;
import com.algarworks.pagamento.Cartao;
import com.algarworks.pagamento.Operadora;
import com.algarworks.impressora.*;

public class Checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra , Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		}
		else {
			System.out.println("Pagamento Negado!");
		}
	}
	
}
