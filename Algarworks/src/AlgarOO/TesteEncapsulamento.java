package AlgarOO;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.trocarTemperatura(21);
		
		System.out.println("A temperatura é: " + ar.obterTemperatura());
		
		
		System.out.println("A nova temperatura é: " + ar.obterTemperatura());

	}

}
