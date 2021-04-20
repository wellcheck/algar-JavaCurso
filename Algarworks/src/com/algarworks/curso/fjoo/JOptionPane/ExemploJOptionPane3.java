package com.algarworks.curso.fjoo.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class ExemploJOptionPane3 {

	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		
		//Cria uma caixa de alerta com opçoes.
		Object[] opcao = {"Sim", "Não", "Sim - Com e-mail!"};		
		int opcoes = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro!?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[2]);

		System.out.println("Opção selecionada foi a: " + opcoes);
	}

}
