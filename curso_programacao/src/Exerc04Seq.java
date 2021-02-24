import java.util.Scanner;
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class Exerc04Seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matFunc, horasTrab;
		double vlHoraFunc, salBrutoFunc;
		
		System.out.print("Matrícula Func: ");
		matFunc = sc.nextInt();

		System.out.print("Qtd Horas Trabalhadas: ");
		horasTrab = sc.nextInt();
		
		System.out.print("Informe o Valor Hora: ");
		vlHoraFunc = sc.nextDouble();
		
		salBrutoFunc = horasTrab * vlHoraFunc;
		
		System.out.println("\nMatrícula: " + matFunc);
		System.out.printf("Salário Bruto U$: %.2f", salBrutoFunc);
				
		sc.close();
	}

}
