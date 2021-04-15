package com.algarworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = new SimuladorBancoDeDados().buscarAlunos();

		//De alguma forma sorteia o nome aluno e constr�i o objeto aluno.
		Aluno alunoSorteado = new Aluno("Maria");
	
		//Para essa compara��o funcionar, precisa adicionar o metodo equals na classe aluno.
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabens " + alunoSorteado.getNome() + " Voc� foi premiado!");
		}else {
			System.out.println("Aluno n�o cadastrado no banco de dados!");
		}
	}

}
