package AlgarOO;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel; // Sempre come�a como falso.
	
	Proprietario dono;
	
	/* Esse this � para fora do m�todo para a variavel modelo dentro da classe e a outra palavra modelo � para o m�todo que,
	 * est� recebendo parametros da classe ExemploThis.java */
	void alterarModelo(String modelo) {
		if(modelo != null) {
		this.modelo = modelo;
		}
	}
	
	void ligar() {
		
		System.out.println("Ligando o carro: " + modelo);
		
	}

}
