package entities;

public class BusinessAccount extends Account {
	private Double loanLimit; // limite de emprestimo

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// emprestimo
	public void loan(double amount) {
		if (amount <= loanLimit) { 
			//deposit(amount);
			balance += amount - 10; // Taxa de emprestimo
		} else {
			System.out.println("Amount not allowed!!!");
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}	
}