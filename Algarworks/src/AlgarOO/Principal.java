package AlgarOO;

public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		
		meuCarro.modelo = "Uno - Deus das Estadras";
		meuCarro.fabricante = "Fiat";
		meuCarro.cor = "Preto";
		meuCarro.anoDeFabricacao = 2013;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.cor = "Preta";
		seuCarro.anoDeFabricacao = 2018;
		
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Fabricante: " + meuCarro.fabricante);
		
		System.out.println("=========================================================");
		
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Fabricante: " + seuCarro.fabricante);

	}

}
