package Strategy;

public class BasicAccountStrategy extends CableTVStrategy{
	
	private static double  serviceCharge = 0.2;

	@Override
	public double invoice(double numbersChannels, double valueChannels) {
		return (numbersChannels * valueChannels)*this.serviceCharge + numbersChannels * valueChannels;
	}

}
