package AlgarOO;

public class TesteJavaBean {

	public static void main(String[] args) {
		PessoaBean p1 = new PessoaBean();
		
		p1.setNome("Wellington");
		p1.setIdade(29);
		
		System.out.println(p1.getNome() + p1.getIdade());

	}

}
