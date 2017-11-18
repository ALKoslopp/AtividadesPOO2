package Domain;

public class Pessoa {
	
	protected String cpf;
	protected String nome;
	protected Categoria categoria;
	protected int lugar;
	
	
	public Pessoa(String cpf, String nome, int lugar, Categoria categoria) {
		super();
		this.lugar = lugar;
		this.cpf = cpf;
		this.nome = nome;
		this.categoria = categoria;
	}
        
	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", Lugar= "+ lugar + ", categoria=" + categoria + "]";
	}
}