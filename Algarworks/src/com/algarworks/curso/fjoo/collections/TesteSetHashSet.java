package com.algarworks.curso.fjoo.collections;

import java.util.Set;
import java.util.HashSet;

public class TesteSetHashSet {

	public static void main(String[] args) {
		// Essa parte � para criar os objetos a partir da classe Aluno com um contrutor,
		// os parametros desse construtor � o nome do aluno.
		Aluno a1 = new Aluno("Jo�o");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Jos�");
		Aluno a4 = new Aluno("pedro");

		// Modo Set n�o permite repitir objetos.
		//E o modo de exibi��o � aleat�rio.
		Set<Aluno> alunos = new HashSet<Aluno>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		imprimirAluno(alunos);

	}

	public static void imprimirAluno(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
