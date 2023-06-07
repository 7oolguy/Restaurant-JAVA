package sistemaDeRestaurante;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Caixa caixa = new Caixa();
		Pedido pedido = new Pedido();
		Garcom garcom = new Garcom();
		
		pedido.status();
		garcom.status();
		garcom.check(pedido.getComida(garcom.getPedido()));
		garcom.check(pedido.getBedida(garcom.getPedidoB()));
		garcom.status();
		pedido.status();
		
		
		
	}

}
