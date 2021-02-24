package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;

		System.out.print("Banking system");
		System.out.println();
		System.out.println();
		
		int accountNumber;
		System.out.print("Enter account number? ");
		accountNumber = sc.nextInt(); // Deixa uma quebra de linha pendente

		// Limpar o buffer do teclado pois a leitura seguinte eh uma variavel string
		sc.nextLine();
		
		String holter;
		System.out.print("Enter account Holter? ");
		holter = sc.nextLine();
		
		char hAsInitialDeposit;
		System.out.print("Is there na initial deposit (y/n)? ");
		hAsInitialDeposit = sc.next().charAt(0);
		
		if (hAsInitialDeposit == 'Y' || hAsInitialDeposit == 'y'){
			double initialDeposit;
			System.out.print("Enter initial deposit value? ");
			initialDeposit = sc.nextDouble();

			account = new Account(accountNumber, holter, initialDeposit);
		}
		else {
			account = new Account(accountNumber, holter);
		}
		
		System.out.println();
		System.out.println("Account data: " + account.toString());
		System.out.println();
		
		double valueDeposit;
		System.out.print("Enter a deposit value: ");
		valueDeposit = sc.nextDouble();
		
		account.depositAccount(valueDeposit);

		System.out.println();
		System.out.println("Updated account data: (increment)" + account.toString());
		System.out.println();
		
		double valueWithdraw;
		System.out.print("Enter a withdraw value: ");
		valueWithdraw = sc.nextDouble();
		
		account.withdrawAccount(valueWithdraw);		

		System.out.println();
		System.out.println("Updated account data: (withdraw) " + account.toString());
		System.out.println();
		
		sc.close();
	}

}
