package sistemaDeRestaurante;

public abstract class Funcionario{
	boolean order = false;
	boolean making = false;
	boolean ready = false;
	String food = "";
	String drink = "";
	public abstract String status();
	int[] next;
	int i;

}
