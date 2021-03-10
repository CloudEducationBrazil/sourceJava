package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program2 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		String path = "C:\\temp\\in2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCSV = br.readLine();
			while (employeeCSV != null) {
				String[] fields = employeeCSV.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCSV = br.readLine();
			}
			
			// Ordenando uma coleção de dados
			Collections.sort(list); // class Employee deve do tipo Comparable
			for (Employee s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}