package sistemaDeRestaurante;

public class Pedido extends Funcionario{
	
	double preco = 0;
	
	double nextPedido(int comida) {
		next[i] = comida;
		i++;
		return 0;
	}
	double getComida(int menu) {
		if(menu >= 1 && menu <= 7) {
			switch(menu){
			case 1:
				System.out.println("R$ 72,80 Iscas de Picanha, Chegara em breve");
				food = "Iscas de Picanha";
				this.preco = 72.80;
				return this.preco;
			case 2:
				System.out.println("R$ 14,90 Pao de Alho, Chegara em breve");
				food = "Pao de Alho";
				this.preco = 14.90;
				return this.preco;
			case 3:
				System.out.println("R$ 29,90 Cesta de Batata Frita, Chegara em breve");
				food = "Cesta de Batata Frita";
				this.preco = 29.90;
				return this.preco;
			case 4:
				System.out.println("R$ 41,00 Salada do Chef, Chegara em breve");
				food = "Salada do Chef";
				this.preco = 41.00;
				return this.preco;
			case 5:
				System.out.println("R$ 75,00 File Argentino, Chegara em breve");
				food = "File Argentino";
				this.preco = 75.00;
				return this.preco;
			case 6:
				System.out.println("R$ 24,90 Pudim L`creme, Chegara em breve");
				food = "Pudim L`creme";
				this.preco = 24.90;
				return this.preco;
			case 7:
				System.out.println("R$ 29,00 Palha italiana de chocolate, Chegara em breve");
				food = "Palha italiana de chocolate";
				this.preco = 29.00;
				return this.preco;	
			default:
				System.out.println("");
				this.preco = 0;
				return this.preco;
					
			}
		}
		return 0;
	}
	double getBedida(int menu) {
		if(menu > 7 && menu < 10+1 ) {
			switch(menu) {
			case 9:
				System.out.println("R$ 8,70 Refrigerante, Chegara em breve");
				drink = "Refrigerante";
				this.preco = 8.70;
				return this.preco;
			case 10:
				System.out.println("R$ 15,50 Suco de laranja, Chegara em breve");
				drink = "Suco de Laranja";
				this.preco = 15.50;
				return this.preco;
			}
		}
		return 0;
	}

	@Override
	public String status() {
		if(order == false) {
			if (food != null) {
			order = true;
			}
			System.out.println("Pedido nao foi feito");
		} else if (order == true) {
			System.out.println("Pedido feito");
		} else if (making == false) {
		}
		return null;
	}
	

}
