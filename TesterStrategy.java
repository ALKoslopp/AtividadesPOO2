package Strategy;

public class TesterStrategy {

	public static void main(String[] args) {
		
		InvoiceTVStrategy tv = new InvoiceTVStrategy();
		
		CableTVStrategy accountPremium = new AccountPremiumStrategy();
		CableTVStrategy basicAccount = new BasicAccountStrategy();
		
		System.out.println(tv.generateInvoice(basicAccount, 20, 3));
		System.out.println(tv.generateInvoice(accountPremium, 23, 3));
		

	}

}
