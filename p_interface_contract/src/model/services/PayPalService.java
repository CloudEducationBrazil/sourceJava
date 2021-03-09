package model.services;

public class PayPalService implements OnlinePaymentService{
	private static final double PAYMENT_FEE = 0.02; // Taxa de Pagamento
	private static final double MONTHLY_INTEREST = 0.01; // Taxa de Juros
	
	// Taxa de Pagamento
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}
	
	// Taxa de Juros
	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	};
}