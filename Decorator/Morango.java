package Decorator;

public class Morango extends CoberturaDecorator{

	private Sorvete sorvete;
	
	public Morango (Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public String getDescricao() {
		return sorvete.getDescricao() + " Calda de Morango com alcaçus ";
	}
	
	@Override
	public double calculaPreco() {
		return sorvete.calculaPreco() + 0.50;
	}
	

}
