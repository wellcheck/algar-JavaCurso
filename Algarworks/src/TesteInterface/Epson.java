package TesteInterface;

import com.algarworks.impressora.Impressora;
import com.algarworks.impressora.Imprimivel;

public class Epson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("***********************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("***********************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("------------------------");
		System.out.println("=         Epson        =");
		System.out.println("------------------------");

	}

}
