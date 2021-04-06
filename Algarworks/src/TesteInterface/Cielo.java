package TesteInterface;

import com.algarworks.pagamento.Autorizavel;
import com.algarworks.pagamento.Cartao;
import com.algarworks.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override // Está verificando as condições para autorizar o cartão com base nos critérios
				// método.
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("1234") && autorizavel.getValorTotal() < 100;
	}

}
