package Decorator;

public class Chocolate extends CoberturaDecorator{

	private Sorvete sorvete;
	
	public Chocolate(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public String getDescricao() {
		return sorvete.getDescricao() + " Calda de Cocolate com Bala de goma ";
	}
	
	@Override
	public double calculaPreco() {
		return sorvete.calculaPreco() + 0.50;
	}
	

}
