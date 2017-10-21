package Composition;

public class CableTV {
	private String nome;
	private double invoice;
	private double valuePackage;
	private static double serviceCharge = 0.2;
	private static double valueChannel = 3;
	
	public CableTV() {
		this.setNome(this.nome) ;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getValuePackage() {
		return this.valuePackage;
	}
	
	public void setInvoiceGenerated(double numberChannels) {
		this.valuePackage = numberChannels*this.valueChannel;
	}
	
	public double getInvoiceGenerated() {
		return this.invoice;
	}
	
	public double invoiceGenerated() {
		return this.invoice = (this.getValuePackage() * this.serviceCharge)+this.getValuePackage();
		
	}

}
