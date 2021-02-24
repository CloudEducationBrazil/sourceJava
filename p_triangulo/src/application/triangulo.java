package application;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double aX, bX, cX, aY, bY, cY;
		
		System.out.println("Enter the measures of triangle X? ");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y? ");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();

		double p, areaTriangleX, areaTriangleY;
		
		p = ( aX + bX + cX) / 2;
		areaTriangleX = Math.sqrt( p * ( p - aX) * (p - bX) * (p - cX) );
		
		p = ( aY + bY + cY) / 2;
		areaTriangleY = Math.sqrt( p * ( p - aY) * (p - bY) * (p - cY) );

		System.out.printf("Triangle X area: %.2f %n", areaTriangleX);
		System.out.printf("Triangle Y area:%.2f%n", areaTriangleY);
		
		if ( areaTriangleX > areaTriangleY )
			System.out.printf("Larger area X");
		else
			System.out.printf("Larger area Y");
		sc.close();
	}
}
