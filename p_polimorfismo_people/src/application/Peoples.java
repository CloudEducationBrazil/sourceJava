package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.People;
import entities.PhysicalPerson;

public class Peoples {

	public static void main(String[] args) {
		// https://github.com/acenelio/inheritance8-java
		// https://www.youtube.com/watch?v=eDsS3JM5iXw
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<People> list = new ArrayList<People>();
		
		System.out.println("******** Sistema de Peoples ******** ");
		System.out.println();
		
		System.out.print("Enter number of peoples? ");
		int quatityPeople = sc.nextInt();
		
		for (int x = 0; x < quatityPeople; x++) {
			System.out.println("Tax people #" + (x+1) + " data:");
			
			System.out.print("Enter type Physical Person (f) or Legal Person (j)? ");
			char typePeople = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name? ");
			String name = sc.nextLine();
			
			System.out.print("Anual income? ");
			Double incomeAnual = sc.nextDouble();
			
			if ( typePeople == 'f' || typePeople == 'F') {
				System.out.print("Healthy cats? ");
				Double healthyCats = sc.nextDouble();

				list.add(new PhysicalPerson(name, incomeAnual, healthyCats));
			} else {
				System.out.print("Number of Employees? ");
				Integer quantityEmployee = sc.nextInt();

				list.add(new LegalPerson(name, incomeAnual, quantityEmployee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for ( People people : list ) {
			System.out.println(people.getName() + ": $ " + String.format("%.2f", people.taxCollected()));
		}

		System.out.println();
		double sumTaxArrecadado = 0.0;
		
		for ( People people : list ) {
			sumTaxArrecadado += people.taxCollected();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sumTaxArrecadado));
		
		sc.close();
	}
}