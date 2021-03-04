package application;

import entities.BusinessAccount;

public class Accounts {

	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount();
		
		// Saldo null
		System.out.println(account.getBalance());

		// Inserindo saldo inicial $150
		account.deposit(150.00);
		
		// Saldo $150
		System.out.println(account.getBalance());
	}
}
