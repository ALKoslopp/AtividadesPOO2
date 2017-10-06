package Factory;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Ximbinha", "73637 98", 500);
		
		GeraConta geraConta = new GeraConta(new ContaFactory());
		
		Conta conta = geraConta.criaConta("conta salario");
		
		System.out.println(conta.getConta(pessoa));
	}

}
