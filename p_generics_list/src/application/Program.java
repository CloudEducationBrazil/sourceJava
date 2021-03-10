package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int qtd = sc.nextInt();
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		for (int x = 0; x < qtd; x++) {
			System.out.print("Enter element? ");
			Integer element = sc.nextInt();
			
			ps.addValue(element);
		}
		
		System.out.println();
		System.out.println("First element: " + ps.first());
		
		System.out.println();
		ps.print();

		sc.close();
	}
}
