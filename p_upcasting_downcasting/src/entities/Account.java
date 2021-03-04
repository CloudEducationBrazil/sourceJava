package entities;

// Conta bancaria
public class Account {
	private Integer number; // Numero da conta
	private String holder; // titular
	// Modificador de acesso protected. Será acessada pela subclass e por outra class independente do package
	protected Double balance; // saldo

	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumebr(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	// saque
	public void withdraw(double amount) { // quantia
		balance -= amount + 5.00;
	}

	// deposito
	public void deposit(double amount) {
		if ( balance == null) {
			this.balance = 0.0;
		}
		
		balance += amount;
	}
}