package application;

import java.util.Scanner;

import entities.Rectangle;

public class CalculatorRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();

		System.out.print("Enter Width: ");
		rect.width = sc.nextDouble();

		System.out.print("Enter Height: ");
		rect.height = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA = " + rect.Area());
		System.out.println("PERIMETER = " + rect.Perimeter());
		System.out.println("DIAGONAL = " + rect.Diagonal());
		
		sc.close();
	}

}
