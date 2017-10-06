package Factory;

public class ContaSalario implements Conta{

	@Override
	public String getConta(Pessoa pessoa) {
		return pessoa + " tem uma Conta Salario";
	}
	

}
