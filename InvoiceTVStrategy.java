package Strategy;

public class InvoiceTVStrategy {
	
	private CableTVStrategy tv;
	
	public double generateInvoice(CableTV tv, double numbersChannels, double valueChannels) {
		return tv.invoice(numbersChannels, valueChannels);
	}

}
