package com.algarworks.curso.fjoo.JOptionPane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane2 {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		
		//Esse modo permiti alterar titulo da janela, icone para o alerta e do tipo Warning Mensagem
		JOptionPane.showMessageDialog(null, "E-mail digitado errado!!!", "E-mail incorreto", JOptionPane.WARNING_MESSAGE);
		
		//Esse modo permiti alterar titulo da janela, icone para o erro e do tipo Erro Mensagem
		JOptionPane.showMessageDialog(null, "CFP não informado", "Erro" , JOptionPane.ERROR_MESSAGE);
		
		//Esse modo permiti alterar titulo da janela, icone para o nada e do tipo nada.
		JOptionPane.showMessageDialog(null, "Obrigado", "Valeu", JOptionPane.PLAIN_MESSAGE);
		
		//Importa uma imagem png para servi de icone na mensagem.
		URL url = ExemploJOptionPane.class.getResource("coleta.png");
		Icon icone = new ImageIcon(url);
		JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema da WP System.", "Obrigado", JOptionPane.INFORMATION_MESSAGE, icone);
	}

}
