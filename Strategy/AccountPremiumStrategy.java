package Strategy;

public class AccountPremiumStrategy extends CableTVStrategy{
	
	private static double  serviceCharge = 0.2;
	private static double valueAdditionalChannel = 2;

	@Override
	public double invoice(double numbersChannels, double valueChannels) {
		
		return (numbersChannels * valueChannels * this.valueAdditionalChannel)*this.serviceCharge+numbersChannels * valueChannels;
	}

}
