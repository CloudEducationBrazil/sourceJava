package entities;

public class LegalPerson extends People {
	private Integer quantityEmployee;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double incomeAnual, Integer quantityEmployee) {
		super(name, incomeAnual);
		this.quantityEmployee = quantityEmployee;
	}

	@Override
	public double taxCollected() {
		/*double tax;

		if ( quantityEmployee < 11 ) {
			tax = super.getIncomeAnual() * 0.16;
		} else {
			tax = super.getIncomeAnual() * 0.14;
		}*/
		
		// return tax;
		
		return ( quantityEmployee < 11 ) ? super.getIncomeAnual() * 0.16 : super.getIncomeAnual() * 0.14;
	}
}
