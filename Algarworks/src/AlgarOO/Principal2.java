package AlgarOO;

public class Principal2 {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Wellington Paix�o";
		dono1.idade = 29;
		dono1.bairro = "Jardim Ondina";
		dono1.cidade = "S�o Paulo";
		dono1.logradouro = "Rua Pedro de S�o Martinho";
		
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Ford";
		meuCarro.modelo = "Amarok";
		meuCarro.cor = "Prata";
		meuCarro.anoDeFabricacao = 2020;
		
		meuCarro.ligar();
		System.out.println();
		
	}

}
