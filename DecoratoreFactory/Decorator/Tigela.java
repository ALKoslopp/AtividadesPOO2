package Decorator;

public class Tigela extends Sorvete{
	
	public Tigela() {
		descricao = "Sorvete na Tigela com ";
	}

	@Override
	public double calculaPreco() {
		return 3.0;
	}

}
