package com.algarworks.curso.fjoo.ordenador;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//Metodo perfeito para exibir nos arrayslist.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + " tem " + this.idade + " de idade ";
	}
	
	//Metodo para comparar e ordenar os nomes
	@Override
	public int compareTo(Pessoa pessoa) {
		
		return this.nome.compareTo(pessoa.getNome());
	}
}
