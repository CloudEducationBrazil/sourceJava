package application;

import java.util.Scanner;

import entities.Triangle;

public class trianguloClasse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		

		System.out.println("Enter the measures of triangle X? ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y? ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaTriangleX, areaTriangleY;
		areaTriangleX = x.calculaAreaTriangulo();
		areaTriangleY = y.calculaAreaTriangulo();

		System.out.printf("Triangle X area: %.2f %n", areaTriangleX);
		System.out.printf("Triangle Y area:%.2f%n", areaTriangleY);

		if (areaTriangleX > areaTriangleY)
			System.out.printf("Larger area X");
		else
			System.out.printf("Larger area Y");

		sc.close();
	}

}
