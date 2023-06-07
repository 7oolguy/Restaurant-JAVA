package sistemaDeRestaurante;

public class Caixa extends Pedido{
	double deposit;
	
	
	double deposit() {
		this.deposit = preco + this.deposit;
		return this.deposit;	
	}
}
