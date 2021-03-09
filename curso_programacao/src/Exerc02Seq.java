import java.util.Scanner;

public class Exerc02Seq {
	public static void main(String[] args) {
		// Exerc 02. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		//Fórmula da área: area = pi * pow(raio,2)
		//Considere o valor de π = 3.14159
		
		double raio, areaCirculo, pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o raio do círculo: "); 
		raio = sc.nextDouble();
		
		areaCirculo = pi * Math.pow(raio, 2);
		System.out.printf("Área do Círculo: %.4f", areaCirculo); 
		
		sc.close();
	}
}