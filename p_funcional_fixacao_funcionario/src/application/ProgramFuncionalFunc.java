package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Employee;

public class ProgramFuncionalFunc {

	public static void main(String[] args) {
		// https://github.com/acenelio/lambda7-java
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		String path = "c:\\temp\\func.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				
				// 0 = name; 1 = email; 2 = salary
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Enter a salary? ");
			double salary = sc.nextDouble();
			
			double sumSalary = 	list.stream()
								.filter(emp -> emp.getname().charAt(0) == 'M' )
								.map(emp -> emp.getsalary())
								.reduce(0.0, (x,y) -> x + y);
			
			System.out.println();
			System.out.println("Sum of salary from people whose name starts with 'M': " + 
			                   String.format("%.2f", sumSalary));
			
			List<String> emails = list.stream()
					.filter(emp -> emp.getsalary() > salary )
					.map( emp -> emp.getEmail() )
					.sorted().collect(Collectors.toList());

			System.out.println();
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);

			System.out.println();
			for (Employee emp : list)
				System.out.println(emp);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
