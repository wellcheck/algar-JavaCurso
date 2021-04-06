package TesteInterface;

import com.algarworks.caixa.Checkout;
import com.algarworks.caixa.Compra;
import com.algarworks.impressora.Impressora;
import com.algarworks.pagamento.Cartao;
import com.algarworks.pagamento.Operadora;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new Epson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Wellington Paixão");
		cartao.setNumeroCartao("1234");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Wellington Ferreira");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
	
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}

}
