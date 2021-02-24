package application;
import java.util.Scanner;

public class trianguloMetodos {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double a, b, c;
			
			System.out.println("Enter the measures of triangle X? ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			System.out.println("Enter the measures of triangle Y? ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			double areaTriangleX, areaTriangleY;
			areaTriangleX = calculaAreaTriangulo(a, b, c);
			areaTriangleY = calculaAreaTriangulo(a, b, c);

			System.out.printf("Triangle X area: %.2f %n", areaTriangleX);
			System.out.printf("Triangle Y area:%.2f%n", areaTriangleY);
			
			if ( areaTriangleX > areaTriangleY )
				System.out.printf("Larger area X");
			else
				System.out.printf("Larger area Y");

			sc.close();
		}
		
		public static double calculaAreaTriangulo(double x, double y, double z) {
			double p = ( x + y + z) / 2;
			return Math.sqrt( p * ( p - x) * (p - y) * (p - z) );
		}
	}
