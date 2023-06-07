package sistemaDeRestaurante;
import java.util.Scanner;
public class Garcom extends Funcionario{
	Scanner scan = new Scanner(System.in);
	double preco;
	
	
	double check(double valorFood) {
		this.preco += valorFood;
		return this.preco;
	}
	@Override
	public String status() {
			if(food == null) {
				System.out.println("Garcom nao pegou o pedido ainda\n");
			} else if(making == false && ready == true) {
				System.out.println("Pedido pronto, Garcom esta levando para a mesa.\n");
			} else {
				System.out.println("Garcom esta levando o pedido a cozinha\n");
			}
		return null;
	}

	public int getPedido() {
		int pedido = 0;
		System.out.println("Ola,\n"
				+ "Seja Bem Vindo ao nosso Restaurante, aqui esta o nosso cardapio.\n"
				+ "Por favor leve o tempo que precisar.");
		System.out.println("1-R$ 72,80 Iscas de Picanha\n"
				+ "2-R$ 14,90 Pao de Alho\n"
				+ "3-R$ 29,90 Cesta de Batata Frita\n"
				+ "4-R$ 41,00 Salada do Chef\n"
				+ "5-R$ 75,00 File Argentino\n"
				+ "6-R$ 24,90 Pudim L`creme\n"
				+ "7-R$ 29,00 Palha italiana de chocolate\n");
		System.out.println("Faca seu pedido aqui: \n");
		pedido = scan.nextInt();
		order = true;
		
		return pedido;
	}

	public int getPedidoB() {
		int pedido = 0;
		System.out.println("Gostaria de bebida para acompanhar?\n"
				+ "Sim - 1\n"
				+ "Nao - 2\n"
				+ "--> ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("Qual Seria a bebida?\n"
					+ "9- R$ 8,70 Refrigerante\n"
					+ "10-R$ 15,50 Suco de laranja\n");
			System.out.println("Faca seu pedido aqui: \n");
			pedido = scan.nextInt();
		} else if (choice == 2) {
			System.out.println("Muito bem, voltarei logo com seus pedidos\n");
			pedido = 0;
		}
		return pedido;
	}


}
