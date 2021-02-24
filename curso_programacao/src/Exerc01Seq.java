import java.util.Scanner;

public class Exerc01Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exerc 01. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		// mensagem explicativa, conforme exemplos.
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite número 1: "); 
		num1 = sc.nextInt();
		
		System.out.print("Digite número 2: "); 
		num2 = sc.nextInt();
		
		System.out.print("Resultado: " + (num1 + num2));
		
		sc.close();
	}

}
