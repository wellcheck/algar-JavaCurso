package AlgarOO;

public class Principal3 {
	
	public static void main(String[] args) {
		Paciente p = new Paciente();
		
		p.peso = 110;
		p.altura = 1.70;
		
		double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Seu IMC é: " + imcCalculado);
		
	}

}
