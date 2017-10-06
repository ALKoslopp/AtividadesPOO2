package Decorator;

public abstract class Sorvete {
	
	protected String descricao;
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract double calculaPreco();

}
