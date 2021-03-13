package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

import entities.Product;

public class FuncionalExercicie {

	public static void main(String[] args) {
		// https://github.com/acenelio/lambda6-java
		String path = "c:\\temp\\funcional.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);

				list.add(new Product(name, price));

				line = br.readLine();
			}

			double avgPriceProduct = list.stream()
									.map(p -> p.getPrice())
									.reduce(0.0, (x, y) -> x + y) / list.size();
			System.out.println("Average Price: " + String.format("%.2f", avgPriceProduct));

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avgPriceProduct)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());

			System.out.println();
			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}