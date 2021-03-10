package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterfaceInterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		// https://github.com/acenelio/interfaces5-java

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		// Taxa de Juros Brazil
		InterfaceInterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Brazil - Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		// Taxa de Juros USA
		InterfaceInterestService is2 = new UsaInterestService(1.0);
		double payment2 = is2.payment(amount, months);
		
		System.out.println();
		System.out.println("USA - Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment2));
		

		sc.close();
	}
}