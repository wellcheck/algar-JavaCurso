package com.algarworks.curso.fjoo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {

		// Essa parte é para criar os objetos a partir da classe Aluno com um contrutor,
		// os parametros desse construtor é o nome do aluno.
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("pedro");

		// As vantagens do ArrayList, é que o array pode ir crescendo sem limites,
		// diferente do array comum que tempos que especificar tamanho.
		List<Aluno> aluno = new ArrayList<Aluno>();

		aluno.add(a1);
		aluno.add(a2);
		aluno.add(a3);
		aluno.add(a4);

		imprimirAluno(aluno);

	}

	public static void imprimirAluno(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Os nomes dos alunos são: " + a.getNome());
		}
	}
}
