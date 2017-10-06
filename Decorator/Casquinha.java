package Decorator;

public class Casquinha extends Sorvete{
	
	public Casquinha() {
		descricao = "Sorvete na Casquinha de trigo com ";
	}

	@Override
	public double calculaPreco() {
		return 5.0;
	}

}
