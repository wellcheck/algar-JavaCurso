package AlgarOO;

public class TesteConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Wellington", 29);
		
		System.out.println("Nome: " + p1.nome + " Tem: " + p1.idade + " Anos");

		p1.nome = "Wellington";
		p1.idade = 29;
		
		System.out.println("Nome: " + p1.nome + " Tem: " + p1.idade + " Anos");
		
	}

}
