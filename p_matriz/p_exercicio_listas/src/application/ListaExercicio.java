package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class ListaExercicio {
	// https://github.com/devsuperior/aulao001
	// https://github.com/devsuperior/aulao001/raw/master/modelo-conceitual.png
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("How many employees will be registered? ");
			int n = sc.nextInt();

			Emplyoee emp = new Emplyoee();
			List<Emplyoee> list = new ArrayList<Emplyoee>();

			System.out.println();

			for (int x = 0; x < n; x++) {
				System.out.println();

				sc.nextLine();
				System.out.println("Employee # " + (x + 1) + ":");
				System.out.print("Id? ");
				Integer id = sc.nextInt();

				while (hasId(id, list)) {
					System.out.print("Id already taken!!! Try again. Input other Id? ");
					id = sc.nextInt();
				}

				sc.nextLine();

				System.out.print("Name? ");
				String name = sc.nextLine();

				System.out.print("Salary? ");
				Double salary = sc.nextDouble();

				emp = new Emplyoee(id, name);
				emp.setSalary(salary);

				list.add(emp);
			}

			// Aplicar a lista
			System.out.println();
			System.out.println("List of employees:");
			System.out.println();

			for (Emplyoee emp2 : list) {
				System.out.println(emp2.toString());
			}

			System.out.println();
			System.out.print("Enter the employee id that will have salary increase? ");
			int idFunc = sc.nextInt();

			// Integer pos = hasId(idFunc, list);
			emp = list.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);

			if (emp == null) {
				System.out.println("Employee, this id does not exist!");
			} else {
				System.out.println();
				System.out.print("Enter the percentage:");
				double percentage = sc.nextDouble();

				emp.increaseSalary(percentage);
			}

			// Aplicar a lista
			System.out.println();
			System.out.println("List of employees Update:");
			System.out.println();

			for (Emplyoee emp2 : list) {
				System.out.println(emp2.toString());
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

	public static boolean hasId(int chave, List<Emplyoee> list) {
		boolean result = false;

		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == chave) {
					// System.out.println("ACHOUUUUU");
					result = true;
				}
			}
		}

		return result;
	}

	public static boolean hasId_2(int chave, List<Emplyoee> list) {
		Emplyoee emp = list.stream().filter(x -> x.getId() == chave).findFirst().orElse(null);
		return emp != null;
	}

	// Retorna o ID do Employee
	public static Integer position(int chave, List<Emplyoee> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == chave) {
				return i;
			}
		}
		return null;
	}

}
