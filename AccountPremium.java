package Composition;

public class AccountPremium {
	
	CableTV ap;
	private static double valueChannelAdditional = 2;
	private static double channels = 20;
	
	public AccountPremium(CableTV account, String nome) {
		this.ap = account;
		this.setNome(nome);
	}
	
	public void setNome(String nome) {
		ap.setNome(nome);
	}
	
	public String getNome() {
		return ap.getNome();
	}
	
	public void calculatePackage(double numberAdditionalChannels) {
		
		ap.setInvoiceGenerated((numberAdditionalChannels*this.valueChannelAdditional)+this.channels);
	}
	
	public double invoiceGenerated() {
		return ap.invoiceGenerated();
	}

}
