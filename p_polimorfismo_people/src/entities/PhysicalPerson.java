package entities;

public class PhysicalPerson extends People {
	private Double healthyCats; // Gastos com saúde

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double incomeAnual, Double healthyCats) {
		super(name, incomeAnual);
		this.healthyCats = healthyCats;
	}

	@Override
	public double taxCollected() {
		// double tax;
		
		/*
		if ( getIncomeAnual() < 20000.0 ) {
			tax = getIncomeAnual() * 0.15; 
		} else {
			tax = getIncomeAnual() * 0.25; 
		}*/
		
		// Operador Ternário
		double tax = ( getIncomeAnual() < 20000.0 )? getIncomeAnual() * 0.15 : getIncomeAnual() * 0.25;
		
		if ( healthyCats > 0 ) {
			tax -= healthyCats * 0.50;
		}
		
		if ( tax < 0.0 ) {
			tax = 0.0;
		}
		
		return tax;
	}
}