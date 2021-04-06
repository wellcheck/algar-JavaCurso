package TesteInterface;

import com.algarworks.pagamento.Autorizavel;
import com.algarworks.pagamento.Cartao;
import com.algarworks.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override // Est� verificando as condi��es para autorizar o cart�o com base nos crit�rios
				// m�todo.
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("1234") && autorizavel.getValorTotal() < 100;
	}

}
