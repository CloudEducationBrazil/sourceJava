package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class SavingsAccounts {

	public static void main(String[] args) {
		// https://github.com/acenelio/inheritance3-java
		
		// Entrevista presidente da Ericsson Eduardo Ricota - Suécia (Estolcomo)
		// https://m.facebook.com/watch/?v=832977730619259&_rdr
		
		// Conta Normal
		Account acc = new Account(1602, "Heleno", 200.00);
		
		// Conta Empresarial
		BusinessAccount bacc = new BusinessAccount(1517, "Julia", 0.00, 1000.00);
		
		// Upcasting - converter uma subclasse numa superclasse	
		Account acc1 = bacc;
		
		// Conta Empresarial
		Account acc2 = new BusinessAccount(2130, "Josy", 0.00, 300.00);
		
		// Conta Poupança SavingsAccount
		Account acc3 = new SavingsAccount(7865, "Maria", 0.00, 0.30);
		
		System.out.println(acc1.getBalance()); 
				
		// Downcasting - converter uma superclasse numa subclasse
		//BusinessAccount acc4 = acc2; // Erro - não é possível 
		BusinessAccount acc4 = (BusinessAccount)acc2; // Correto
		acc4.loan(350.00);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // não eh possível pois instanciada como SavingsAccount
		// testar 
		// Aqui não irá executar
		if ( acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3; 
			acc5.loan(180.0);
			System.out.println("Loan!!!");
		}
		
		// Aqui irá executar
		if ( acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3; 
			acc5.updateBalance();
			System.out.println("Update!!!");
		}
		
		// método withdraw da superclasse
		Account acc10 = new Account(1001, "Alex", 1000.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		// método withdraw - sobreposição da superclasse na subclasse
		Account acc11 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc11.withdraw(200.0);
		System.out.println(acc11.getBalance());
		System.out.println();
		
		// método withdraw - Sobreposição usando a palavra super()
		Account acc12 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc12.withdraw(200.0);
		System.out.println(acc12.getBalance());
		System.out.println();
		
		// Polimorfismo - Variáveis
		Account x = new Account(10, "Ju", 1000.00);
		Account y = new SavingsAccount(10, "Ju", 1000.00, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		// Área de memória: Stack | heap
		List<Account> list = new ArrayList<Account>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500.0));
		
		double sum = 0.0;
		
		for (Account accc : list) {
			sum += accc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for (Account accc : list) {
			accc.deposit(10.0);
		}
		
		for (Account accc : list) {
			System.out.printf("Updated Balance for Account %d: %.2f%n", accc.getNumber(), accc.getBalance());
		}
	}
}
