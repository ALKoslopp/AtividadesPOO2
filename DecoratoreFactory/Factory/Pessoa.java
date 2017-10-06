package Factory;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private double saldo;
	
	public Pessoa(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", Cpf=" + cpf + ", Saldo=" + saldo;
	}
	
	

}
