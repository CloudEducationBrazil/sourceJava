import java.util.Scanner;
// Exerc 05: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.


// Exerc 06
// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exerc05Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codPecas01, codPecas02;
		int qtdPecas01, qtdPecas02;

		double vlPecas01, vlPecas02, vlTotalCompras;
		
		System.out.print("Cod Peça 01: ");
		codPecas01 = sc.nextInt();

		System.out.print("Qtd Peças 01: ");
		qtdPecas01 = sc.nextInt();
		
		System.out.print("Informe o Valor de Cada Peça 01: ");
		vlPecas01 = sc.nextDouble();
		
		System.out.print("Cod Peça 02: ");
		codPecas02 = sc.nextInt();

		System.out.print("Qtd Peças 02: ");
		qtdPecas02 = sc.nextInt();
		
		System.out.print("Informe o Valor de Cada Peça 02: ");
		vlPecas02 = sc.nextDouble();
		
		vlTotalCompras = qtdPecas01 * vlPecas01 + qtdPecas02 * vlPecas02;
		
		System.out.println("Código Peças 01: " + codPecas01 + "' Qtd:" + qtdPecas01);
		System.out.println("Código Peças 02: " + codPecas02 + "' Qtd:" + qtdPecas02);

		System.out.printf("Total de Compras U$: %.2f", vlTotalCompras);
				
		sc.close();
	}
}
