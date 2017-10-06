package Factory;

public class ContaFactory {
	
	public Conta criaConta(String tipo) {
		Conta conta = null;
		
		if(tipo.equals("conta corrente"))
			conta = new ContaCorrente();
		
		else if(tipo.equals("conta salario"))
			conta = new ContaSalario();
		
		else if (tipo.equals("conta poupanca"))
			conta = new ContaPoupanca();
		
		return conta;
	}
}
