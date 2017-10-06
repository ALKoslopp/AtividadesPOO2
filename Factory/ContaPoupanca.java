package Factory;

public class ContaPoupanca implements Conta{

	@Override
	public String getConta(Pessoa pessoa) {
		return pessoa + " tem uma Conta Poupanca";
	}
	

}
