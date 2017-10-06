package Decorator;

public class Tester {

	public static void main(String[] args) {
		Sorvete casquinha = new Casquinha();
		
		casquinha = new Chocolate(casquinha);
		casquinha = new Baunilha(casquinha);
		casquinha = new Chocolate(casquinha);
		casquinha = new Caramelo(casquinha);
		
		System.out.println(casquinha.getDescricao());
		System.out.println(casquinha.calculaPreco());

	}

}
