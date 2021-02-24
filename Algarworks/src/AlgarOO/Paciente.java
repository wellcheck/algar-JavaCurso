package AlgarOO;

public class Paciente {
	
	double altura;
	double peso;
	
	double calcularIndiceDeMassaCorporal() {
		double imc = peso / (altura * altura);
		
		return imc;
		
	}

}
