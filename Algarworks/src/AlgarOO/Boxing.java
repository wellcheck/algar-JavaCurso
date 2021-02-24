package AlgarOO;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		// Comparação de valores no Boxing com variaveis do tipo Wrappers é atraves do equals
		
		System.out.println( i1.equals(i2));
		System.out.println( i3.equals(i4));
	}

}
