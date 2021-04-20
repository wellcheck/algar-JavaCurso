package com.algarworks.curso.fjoo.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane4 {

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		Object[] possibilidade = {"Masculino", "Feminino"};
		// Cria uma caixa que permiti seleonar uma opção
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "Algarworks",
				JOptionPane.PLAIN_MESSAGE, null, possibilidade, possibilidade[0]);

		System.out.println("O sexo selecionado foi: " + sexo);
		
		//Cria uma caixa que permiti entrar com o seu nome.
		String nome = (String) JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Algarworks",
				JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		System.out.println("O nome do usuario é: " + nome);
		//
	}

}
