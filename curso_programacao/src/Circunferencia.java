import java.util.Scanner;
import util.Calculators;

public class Circunferencia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double radius;
		System.out.print("Enter with radius: ");
		radius = sc.nextDouble();
		
		double c = Calculators.circumference(radius);
		double v = Calculators.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f", Calculators.PI);
		
		sc.close();
	}
}
