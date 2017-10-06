package Factory;

public class GeraConta {
	
	private ContaFactory conta;
	
	public GeraConta(ContaFactory conta) {
		
		this.conta = conta;
	}
	
	public Conta criaConta(String tipo) {
		return conta.criaConta(tipo);
	}

}
