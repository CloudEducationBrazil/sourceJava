import java.util.Scanner;

import util.Calculators;

public class ConversaoValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Cotação do Dolar $$
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		// Qtd Dolar Comprado
		System.out.println("How many dollars will be bought? ");
		double dollarQuantity = sc.nextDouble();
		
		// Valor a ser Pago em Reais
		double valueDollarReais;
		valueDollarReais = Calculators.convertDollarReal(dollarPrice, dollarQuantity);
		System.out.printf("Amount to be paid in reias: %.2f", valueDollarReais);		
		
		sc.close();
	}

}
