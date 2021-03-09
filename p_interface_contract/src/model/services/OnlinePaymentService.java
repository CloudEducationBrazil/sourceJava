package model.services;

// Contrato
public interface OnlinePaymentService{
	// Taxa de Pagamento
	double paymentFee(double amount);
	
	// Taxa de Juros
	double interest(double amount, int months);
}
