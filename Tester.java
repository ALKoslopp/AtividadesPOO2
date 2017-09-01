package Composition;

public class Tester {

	public static void main(String[] args) {
		
		CableTV tv = new CableTV();
		
		AccountPremium accountPremium = new AccountPremium(tv, "ZE maiusculo");
		accountPremium.calculatePackage(3);
		System.out.println(accountPremium.getNome() + " = " + accountPremium.invoiceGenerated());
		
		System.out.println(" ------- ");
		
		BasicAccount basicAccount = new BasicAccount(tv, "ze minusculo");
		basicAccount.calculatePackage(20);
		System.out.println(basicAccount.getNome() + " = " + basicAccount.invoiceGenerated());

	}

}
