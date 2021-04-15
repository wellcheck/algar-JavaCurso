package com.algarworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = new SimuladorBancoDeDados().buscarAlunos();

		//De alguma forma sorteia o nome aluno e constrói o objeto aluno.
		Aluno alunoSorteado = new Aluno("Maria");
	
		//Para essa comparação funcionar, precisa adicionar o metodo equals na classe aluno.
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabens " + alunoSorteado.getNome() + " Você foi premiado!");
		}else {
			System.out.println("Aluno não cadastrado no banco de dados!");
		}
	}

}
