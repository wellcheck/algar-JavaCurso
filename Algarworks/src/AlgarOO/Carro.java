package AlgarOO;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel; // Sempre começa como falso.
	
	Proprietario dono;
	
	/* Esse this é para fora do método para a variavel modelo dentro da classe e a outra palavra modelo é para o método que,
	 * está recebendo parametros da classe ExemploThis.java */
	void alterarModelo(String modelo) {
		if(modelo != null) {
		this.modelo = modelo;
		}
	}
	
	void ligar() {
		
		System.out.println("Ligando o carro: " + modelo);
		
	}

}
