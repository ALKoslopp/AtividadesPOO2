package Decorator;

public class Baunilha extends CoberturaDecorator{
	
	private Sorvete sorvete;
	
	public Baunilha (Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public String getDescricao() {
		return sorvete.getDescricao() + " Calda de Baunilha com Marchmelous ";
	}
	
	@Override
	public double calculaPreco() {
		return sorvete.calculaPreco() + 0.50;
	}

}
