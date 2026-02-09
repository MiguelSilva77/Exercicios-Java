package services;

public class PaypalServices implements OnlinePaymantServices{

	@Override
	public double paymentFee(double amount) {
		double fee = amount *0.02;
		return fee;
	}

	@Override
	public double interest(double amount, int months) {
		double interest = amount * 0.01 * months;
		return interest;
	}
	
	

}
