package com.algarworks.curso.fjoo.ordenador;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Wellington", 29);
		Pessoa p2 = new Pessoa("Melissa", 4);
		Pessoa p3 = new Pessoa("Danilo", 25);
		Pessoa p4 = new Pessoa("Clovis", 49);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);
		IdadeComparador idadeComparador = new IdadeComparador();
		Collections.sort(pessoas, idadeComparador);
		
		//Para esse for funcionar assim precisa do metodo toString na classe pessoa.
		for(Pessoa pessoa : pessoas ) {
			System.out.println(pessoa);
		}

	}

}
