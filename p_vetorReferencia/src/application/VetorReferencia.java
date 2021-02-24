package application;

import java.util.Scanner;
import entities.Product;

public class VetorReferencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value n? ");
		int n = sc.nextInt();

		// Vetor Referência
		Product[] product = new Product[n];
		
		// Entrada de Dados
		for (int x = 0; x < product.length; x++) {
			System.out.print("Enter witch name product[" + x + "]? ");
			sc.nextLine(); // Eliminar o ENTER
			String name = sc.nextLine();
			
			System.out.print("Enter witch price product[" + x + "]? ");
			double price = sc.nextDouble();
			
			System.out.println();
			
			product[x] = new Product(name, price);
		}		
		
		// Saida de Dados
		for (int x = 0; x < product.length; x++) {
			System.out.print("Name[" + x + "] " + product[x].getName() + " - ");
			System.out.println("Price[" + x + "] " + product[x].getPrice());
		}			
		
		sc.close();
	}
}