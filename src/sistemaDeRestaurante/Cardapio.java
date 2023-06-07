package sistemaDeRestaurante;

public class Cardapio implements Acao{
	int comida = 0;
	int bebida = 0;
	int mesa;
		
	@Override
	public int getComida(int comida) {
		this.comida = comida;
		return comida;
	}

	@Override
	public int getBebida(int bebida) {
		this.bebida = bebida;
		return bebida;
	}

	@Override
	public int getMesa(int mesa) {
		this.mesa = mesa;
		return mesa;
	}

}
