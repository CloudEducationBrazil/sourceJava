import java.util.Scanner;

public class Exerc03Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.print("Diferença Entre o Produto: " + ( (a * b) - (c * d) ) );
		
		sc.close();
	}

}
