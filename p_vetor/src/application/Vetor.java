package application;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value n? ");
		int n = sc.nextInt();

		// Vetor Estático
		double[] vect = new double[n];
		double sum = 0;
		
		for (int x = 0; x < n; x++) {
			System.out.print("Digite Elemento Vect[" + x + "]? ");
			vect[x] = sc.nextDouble();
			sum += vect[x];
		}
		
		System.out.println();
		if ( n > 0 )
			System.out.printf("Avarage Heigth: %.2f", sum / n );
		
		sc.close();
	}
}
