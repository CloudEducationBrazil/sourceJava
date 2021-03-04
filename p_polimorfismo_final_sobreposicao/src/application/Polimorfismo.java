package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Polimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//https://github.com/acenelio/inheritance4-java

		System.out.println("******** Sistema de Employee ********");
		System.out.println();

		List<Employee> employeeList = new ArrayList<Employee>();

		System.out.print("Enter the number of employees? ");
		int numEmployee = sc.nextInt();
		System.out.println();

		for (int x = 0; x < numEmployee; x++) {
			sc.nextLine();
			System.out.println("Employee #" + (x + 1) + ":");

			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name? ");
			String name = sc.nextLine();

			System.out.print("Hours? ");
			Integer hours = sc.nextInt();

			System.out.print("Value per hour? ");
			Double valuePerHour = sc.nextDouble();

			if (outsourced == 'y' || outsourced == 'Y') {
				System.out.print("Additional charge? ");
				Double additionalCharge = sc.nextDouble();
				
				employeeList.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employeeList.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		System.out.println();

//		for (int y = 0; y < employeeList.size(); y++) {
//			System.out.println(employeeList.get(y).getName() + " - $" + String.format("%.2f", employeeList.get(y).payment()));
//		}
		
		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));			
		}

		sc.close();
	}
}
