package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// https://github.com/acenelio/exceptions2-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("****** Sistema Account com Tratamento de Exceções ******");
		System.out.println();

		try {
			System.out.println("Enter account data");
			System.out.println();

			System.out.print("Number? ");
			Integer number = sc.nextInt();

			sc.nextLine();
			System.out.print("Holder? ");
			String holder = sc.nextLine();

			System.out.print("Initial balance? ");
			Double balance = sc.nextDouble();

			System.out.print("Withdraw limit? ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			//acc.deposit(200);

			System.out.print("Enter amount for withdraw? ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.println();
			System.out.println(acc);

		}
		catch (DomainException e) {
			System.out.println("\nError in reservation:" + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("\nUnexpected error. Contact of suport!!!");
		}

		finally {
			sc.close();
		}
	}
}