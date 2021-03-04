package entities;

// com a clausura final, evita que sejam criadas subclasses a partir da classe SavingsAccount
// Não pode ser herdada por outra classe
public final class SavingsAccount extends Account {
	private Double interestRate; // Taxa de Juros

	// Conta Poupança
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Calusura final, evita que o método account seja sobreposto
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}