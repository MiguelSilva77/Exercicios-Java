package services;

public interface OnlinePaymantServices {
	
	double paymentFee(double amount);
	
	double interest(double amount, int months);
}
