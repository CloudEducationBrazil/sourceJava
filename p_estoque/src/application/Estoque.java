package application;

import java.util.Scanner;
import entities.Product;
import utils.Calculator;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Control Stock - Enter product data");
		System.out.println();
		
		System.out.print("Name? ");
		String name = sc.nextLine();
		
		System.out.print("Quantity in stock? ");
		double quantity = sc.nextDouble();
		
		System.out.print("Price? ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, quantity, price);
		
		System.out.println("Product data:" + product);
		
		double qtd;
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		qtd = sc.nextDouble();
		product.addProducts(qtd);

		System.out.println("Updaded data: " + product);

		System.out.println();
		System.out.println("Remove from Stock");
		System.out.print("Enter the number of products to be removed from stock: ");
		qtd = sc.nextDouble();
		product.removeProducts(qtd);

		System.out.println();
		System.out.println("Updaded data: " + product);
		System.out.println();
		
		// altera o nome no atributo protegido da classe
		product.setName("Computador");
		
		// Acessa o nome
		System.out.println(product.getName());
		
		// Não precisa adicionar este package, pois não tem dependência para instanciar as classes (class).
		System.out.println("Soma: " + Calculator.soma());
		
		sc.close();
	}
}