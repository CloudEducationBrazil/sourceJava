package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	// Declara a INTERFACE
	private OnlinePaymentService onlinePaymentService;
	
	// Utiliza a INTERFACE no construtor utilizando INVERSÃO DE CONTROLE aonde irá receber uma INJEÇÃO DE DEPENDÊNCIA por uma outra Classe
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
				
		for (int x = 1; x <= months; x++) {
			double parcialQuota = basicQuota + onlinePaymentService.paymentFee(basicQuota);
			double fullQuota = parcialQuota  + onlinePaymentService.interest(parcialQuota, x);
			
			Date dueDate = addMonths(contract.getDateContract(), x);
			
			// Adiciona ao objeto //List<Installment>
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	};
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		
		return cal.getTime();
	}
}
