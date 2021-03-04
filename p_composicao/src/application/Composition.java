package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Composition {

	public static void main(String[] args) throws ParseException {
		// Código https://github.com/acenelio/composition1-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Sistema Folha de Pagamento - Funcionário");
		System.out.println();

		System.out.print("Enter department's name? ");
		String departmentName = sc.nextLine();
		
		//Department department = new Department();
		//department.setName(departmentName);

		System.out.println();

		// Dados do Trabalhador
		System.out.print("Enter worker data:");
		System.out.println();

		System.out.print("Enter name? ");
		String workerName = sc.nextLine();

		System.out.print("Enter level? ");
		String workLevel = sc.nextLine();

		System.out.print("Enter base salary? ");
		Double baseSalary = sc.nextDouble();

//		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workLevel), baseSalary, department);
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departmentName));
		
		// Quantidade de Contratos do Trabalhador
		System.out.println();
		System.out.print("How many contracts to this worker? ");
		int quantityContracts = sc.nextInt();
		
		// Dados do Contrato do Trabalhador
		for (int x = 0; x < quantityContracts; x++) {

			System.out.println();
			System.out.println("Enter contract #" + x + " data");
			System.out.print("Date (DD/MM/YYYY)? ");
			Date contractDate = sdf.parse(sc.next());
			
			//System.out.println(contractDate);

			System.out.print("Value per hour? ");
			Double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours)? ");
			Integer hours = sc.nextInt();
			
			HourContract hourContract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(hourContract);
		}

		// Filtro para Listar os contratos e salário do trabalhador
		System.out.println();
		System.out.print("Enter month and year to calcule income (MM/YYYY)? ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		//System.out.println("mes " + month);
		// Assim int year  = Integer.parseInt(monthAndYear.substring(3, 7)); Ou
		int year  = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("year " + year);

		// Saída de Dados
		System.out.println("Name worker: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + " : " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}
