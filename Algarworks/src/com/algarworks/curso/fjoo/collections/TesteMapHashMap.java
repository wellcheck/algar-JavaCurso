package com.algarworks.curso.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		// Essa parte é para criar os objetos a partir da classe Aluno com um contrutor,
		// os parametros desse construtor é o nome do aluno.
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("pedro");

		// Chave é do tipo String e o objeto é do tipo Aluno
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();

		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);

		imprimirAluno(alunos);
	}

		//Nesse método você escolher pelo valor.
	private static void imprimirAluno(Map<String, Aluno> alunos) {
		for(Aluno a: alunos.values()) {
			System.out.println("Nomes: " + a.getNome());
		}
		
	}

}
