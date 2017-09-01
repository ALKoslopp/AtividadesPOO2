package Composition;

public class BasicAccount {
	
	CableTV ac;
	
	public BasicAccount(CableTV account, String nome) {
		this.ac = account;
		this.setNome(nome);
	}
	
	public void setNome(String nome) {
		ac.setNome(nome);
	}
	
	public String getNome() {
		return ac.getNome();
	}
	
	public void calculatePackage(double numberChannels) {
		
		ac.setInvoiceGenerated(numberChannels);
	}
	
	public double invoiceGenerated() {
		return ac.invoiceGenerated();
	}

}
