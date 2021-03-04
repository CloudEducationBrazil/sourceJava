package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExercisePolymorphism {

	public static void main(String[] args) throws ParseException {
		// http://github.com/acenelio/inheritance5-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		List<Product> productList = new ArrayList<Product>();

		System.out.println("Sistema de Polimorfismo - Exercício");
		System.out.println();

		System.out.print("Enter the number of products? ");
		int quantityProducts = sc.nextInt();

		for (int x = 0; x < quantityProducts; x++) {
			System.out.println();
			System.out.println("Product #" + (x + 1) + " data: ");

			System.out.println();
			System.out.print("Product: Common (c), used (u) or imported (i)? ");
			char reponse = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name? ");
			String name = sc.nextLine();

			System.out.print("Price? ");
			Double price = sc.nextDouble();

			switch (reponse) {
				case 'c': {
					productList.add(new Product(name, price));
					break;
				}
				case 'u': {
					System.out.print("Manifacture date (dd/MM/yyyy)? ");
					Date date = sdf.parse(sc.next());
					productList.add(new UsedProduct(name, price, date));
					break;
				}
				case 'i': {
					System.out.print("Customs fee? ");
					Double customsFee = sc.nextDouble();
					productList.add(new ImportedProduct(name, price, customsFee));
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : productList) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}