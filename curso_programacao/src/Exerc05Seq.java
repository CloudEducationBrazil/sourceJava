import java.util.Scanner;
// Exerc 05: Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
// c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.


// Exerc 06
// Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
// a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
// b) a �rea do c�rculo de raio C. (pi = 3.14159)
// c) a �rea do trap�zio que tem A e B por bases e C por altura.
// d) a �rea do quadrado que tem lado B.
//e) a �rea do ret�ngulo que tem lados A e B.

public class Exerc05Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codPecas01, codPecas02;
		int qtdPecas01, qtdPecas02;

		double vlPecas01, vlPecas02, vlTotalCompras;
		
		System.out.print("Cod Pe�a 01: ");
		codPecas01 = sc.nextInt();

		System.out.print("Qtd Pe�as 01: ");
		qtdPecas01 = sc.nextInt();
		
		System.out.print("Informe o Valor de Cada Pe�a 01: ");
		vlPecas01 = sc.nextDouble();
		
		System.out.print("Cod Pe�a 02: ");
		codPecas02 = sc.nextInt();

		System.out.print("Qtd Pe�as 02: ");
		qtdPecas02 = sc.nextInt();
		
		System.out.print("Informe o Valor de Cada Pe�a 02: ");
		vlPecas02 = sc.nextDouble();
		
		vlTotalCompras = qtdPecas01 * vlPecas01 + qtdPecas02 * vlPecas02;
		
		System.out.println("C�digo Pe�as 01: " + codPecas01 + "' Qtd:" + qtdPecas01);
		System.out.println("C�digo Pe�as 02: " + codPecas02 + "' Qtd:" + qtdPecas02);

		System.out.printf("Total de Compras U$: %.2f", vlTotalCompras);
				
		sc.close();
	}
}
