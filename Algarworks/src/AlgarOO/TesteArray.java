package AlgarOO;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notas[] = new int[4];
		notas [0] = 10;
		notas [1] = 5;
		notas [2] = 8;
		notas [3] = 9;
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		
		//Permite percorrer com o metodo length um array conforme for implementando. 
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição [" + i + "]" + " Nota [" + notas[i] + "]");
		}

		
	}

}
