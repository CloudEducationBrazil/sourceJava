package entities;

public class Account {
	private int account; // Numero da Conta
	private String holder; // titular da conta
	private double balance; // Saldo

	// Constructor Padrão
	public Account() {
	}
	
	// Constructor
	public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		depositAccount(initialDeposit);
	}

	// Constructor - sobrecarga
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	// Account - Conta -- propriedades (properties)
	public int getAccount() {
		return account;
	}
	
	// Numero da Conta não pode ser alterado uma vez criado a conta corrente
	//public void setAccount(int account) {
	//	this.account = account;
	//}
	
	// Holder - Titular da Conta
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Deposito da conta corrente
	public void depositAccount(double amount) {
		this.balance += amount;
	}

	// Saque da conta corrente
	public void withdrawAccount(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return 	"Account: " + account + ", " +
				"Holder: " + holder  + ", " +
				"Balance: $ " + String.format("%.2f", balance);
	}
}