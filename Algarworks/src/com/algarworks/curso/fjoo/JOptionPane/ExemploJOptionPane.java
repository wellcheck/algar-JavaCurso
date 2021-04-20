package com.algarworks.curso.fjoo.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane  {
	public static void main(String[] args) throws Exception {
		//Exibe uma mensagem de alerta, com o icone padrão.
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		
	}

}
