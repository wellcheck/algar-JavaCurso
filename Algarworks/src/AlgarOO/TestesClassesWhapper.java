package AlgarOO;

public class TestesClassesWhapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		Integer i = new Integer(5);
		
		byte y = i.byteValue();
		
		//Converter String em Float.
		String valor = "15.5";
		Float v = new Float(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("29");
		System.out.println("Daqui a 5 anos voce terá:" + (idade + 5) + " Anos");
	}

}
