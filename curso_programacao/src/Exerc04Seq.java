import java.util.Scanner;
// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
// hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
// decimais.

public class Exerc04Seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matFunc, horasTrab;
		double vlHoraFunc, salBrutoFunc;
		
		System.out.print("Matr�cula Func: ");
		matFunc = sc.nextInt();

		System.out.print("Qtd Horas Trabalhadas: ");
		horasTrab = sc.nextInt();
		
		System.out.print("Informe o Valor Hora: ");
		vlHoraFunc = sc.nextDouble();
		
		salBrutoFunc = horasTrab * vlHoraFunc;
		
		System.out.println("\nMatr�cula: " + matFunc);
		System.out.printf("Sal�rio Bruto U$: %.2f", salBrutoFunc);
				
		sc.close();
	}

}
