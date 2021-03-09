package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// https://www.youtube.com/watch?v=-_ObFKxG30Q
		// https://github.com/devsuperior/aulao008
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("*********** System of Contracts ***********"); 
		System.out.println();
		
		System.out.println("Enter contract data");
		System.out.println();
		
		System.out.print("Number? "); 
		Integer number = sc.nextInt();
		
		System.out.print("Date? ");
		Date dateContract = sdf.parse(sc.next());
		
		System.out.print("Contract value? ");
		Double totalValue = sc.nextDouble();
		
		System.out.println();
		System.out.print("Enter number of installments? ");
		int quantityInstallments = sc.nextInt();
		
		Contract contract = new Contract(number, dateContract, totalValue);
		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, quantityInstallments);
		
		// Testando a Interface
		//OnlinePaymentService ps = new PayPalService();
		//System.out.println("Taxa de Pag: " + ps.paymentFee(200.0));
		//System.out.println("Taxa de Pag: " + ps.interest(200.0, 3));
		//////////// 
	
		System.out.println();
		System.out.println("Installments:");
		
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
		sc.close();
	}
}