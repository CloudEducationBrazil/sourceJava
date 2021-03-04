package entities;

public abstract class People {
	private String name; // nome
	private Double incomeAnual; // Renda Anual

	public People() {
	}

	public People(String name, Double incomeAnual) {
		this.name = name;
		this.incomeAnual = incomeAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncomeAnual() {
		return incomeAnual;
	}

	public void setIncomeAnual(Double incomeAnual) {
		this.incomeAnual = incomeAnual;
	}
	
	public abstract double taxCollected();
}