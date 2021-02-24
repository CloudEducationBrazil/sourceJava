package entities;

public class Employee {
	public String name; // nome
	public double grossSalary; //salário bruto
	public double tax; //imposto
	
	//salario liquido
	public double netSalary() {
		return grossSalary - tax;
	}

	//incremento no salario bruto
	public void increaseSalary(double percentage) {
		grossSalary *= (1 + percentage/100); 
	}
	
	public String toString() {
		return name + ", $ " + 
	           String.format("%.2f", netSalary());
	}
}
