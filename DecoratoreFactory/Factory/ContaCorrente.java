package Factory;

public class ContaCorrente implements Conta{

	@Override
	public String getConta(Pessoa pessoa) {
		return pessoa + " tem uma Conta Corrente";
	}
	
	

}
