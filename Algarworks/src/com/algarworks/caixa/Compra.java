package com.algarworks.caixa;

import com.algarworks.impressora.Imprimivel;
import com.algarworks.pagamento.Autorizavel;
import com.algarworks.impressora.*;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String Produto;
	private String nomeCliente;
	
	@Override
	public double getValorTotal() {
		
		return this.valorTotal;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
		
	}

	@Override
	public String getCorpoPagina() {
		return this.getNomeCliente();
		
	}

	
}
