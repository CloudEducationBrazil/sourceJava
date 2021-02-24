package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// https://github.com/acenelio/matrix2-java

		System.out.println("MATRIZ ESQUERDA DIREITA ACIMA ABAIXO");

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];

		// matriz.length -- Qtd de Linhas
		// matriz[l].length -- Qtd Colunas

		/*
		 * Enter witch element of Matriz [0,0]? 4  Enter witch element of Matriz [0,1]? 5
		 * Enter witch element of Matriz [0,2]? 8  Enter witch element of Matriz [0,3]? 6
		 * 
		 * Enter witch element of Matriz [1,0]? 2  Enter witch element of Matriz [1,1]? 12 
		 * Enter witch element of Matriz [1,2]? 11 Enter witch element of Matriz [1,3]? 0 
		 * 
		 * Enter witch element of Matriz [2,0]? 11 Enter witch element of Matriz [2,1]? 8 
		 * Enter witch element of Matriz [2,2]? 8  Enter witch element of Matriz [2,3]? 87 
		 * 
		 * Enter witch element of Matriz [3,0]? 45 Enter witch element of Matriz [3,1]? 13 
		 * Enter witch element of Matriz [3,2]? 56 Enter witch element of Matriz [3,3]? 8
		 * 
		 */

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print("Enter witch element of Matriz [" + l + "," + c + "]? ");
				matriz[l][c] = sc.nextInt();
			}
		}

		// Impressão da Matriz
		System.out.println();
		System.out.println("Impressão da Matriz");
		for (int l = 0; l < matriz.length; l++) {
			System.out.println();
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print("Element of Matriz [" + l + "," + c + "] = ");
				System.out.print(matriz[l][c] + " ");
			}
		}

		// Element pertencente a Matriz
		System.out.println();
		System.out.println();
		System.out.print("Enter witch Element pertencente a Matriz? ");
		int element = sc.nextInt();
		System.out.println();
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if (element == matriz[l][c]) {
					System.out.println("Position: " + l + "," + c);
					if (c != 0) { // c > 0
						System.out.print("Element do LADO Esquerdo of Matriz [" + l + "," + (c - 1) + "] = ");
						System.out.print(matriz[l][c - 1] + " ");
						System.out.println();
					}

					if (c < matriz[l].length-1) { // (c < matriz[l].length-1)
						System.out.print("Element do LADO Direito of Matriz [" + l + "," + (c + 1) + "] = ");
						System.out.print(matriz[l][c + 1] + " ");
						System.out.println();
					}

					if (l != 0) { // l > 0
						System.out.print("Element do ACIMA of Matriz [" + (l - 1) + "," + c + "] = ");
						System.out.print(matriz[l - 1][c] + " ");
						System.out.println();
					}

					if (l < matriz.length-1) { //  (l < matriz.length-1)
						System.out.print("Element do ABAIXO of Matriz [" + (l + 1) + "," + c + "] = ");
						System.out.print(matriz[l + 1][c] + " ");
						System.out.println();
					}
					
					System.out.println("**************************************************");
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
