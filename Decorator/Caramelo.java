package Decorator;

public class Caramelo extends CoberturaDecorator{
	
	private Sorvete sorvete;
	
	public Caramelo (Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public String getDescricao() {
		return sorvete.getDescricao() + " Calda de Caramelo com Frutas ";
	}
	
	@Override
	public double calculaPreco() {
		return sorvete.calculaPreco() + 0.50;
	}

}
