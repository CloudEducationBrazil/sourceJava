package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
				
		List<Installment> installments = new ArrayList<Installment>();
		
		for (int x = 1; x <= months; x++) {
			double parcialQuota = basicQuota + onlinePaymentService.paymentFee(basicQuota);
			double fullQuota = parcialQuota  + onlinePaymentService.interest(parcialQuota, x);
			
			Date dueDate = addMonths(contract.getDateContract(), x);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	};
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.MONTH, n);
		
		return cal.getTime();
	}
}
