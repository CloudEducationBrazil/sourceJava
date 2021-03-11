package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		// https://github.com/acenelio/generics2-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Most expensive (price products): ");
		System.out.println();
		
		List<Product> list = new ArrayList<Product>();
		
		try ( BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\in3.txt")) ) {
			String line = br.readLine();
			
			while ( line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();
			}
			
			System.out.println("Most expensive (price product): " + CalculationService.max(list));
		}
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error" + e.getMessage());
		}
		sc.close();
	}
}