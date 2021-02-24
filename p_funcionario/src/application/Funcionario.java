package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		Employee func = new Employee();
		
		System.out.print("Enter with name of employee? ");
		func.name = sc.nextLine();
		
		System.out.print("Enter with gross salary? ");
		func.grossSalary = sc.nextDouble();
		
		System.out.print("Enter with tax? ");
		func.tax = sc.nextDouble();
		
		System.out.println();		
		System.out.println("Employee: " + func);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage); 
		
		System.out.println();
		System.out.print("Updated data: " + func);

		sc.close();
	}
}
