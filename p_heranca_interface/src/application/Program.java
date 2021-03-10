package application;

import java.util.Scanner;

import entities.AbstractShape;
import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// https://github.com/acenelio/interfaces2-java		
		// https://github.com/acenelio/interfaces3-java
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle data");
		System.out.print("Width? ");
		double width = sc.nextDouble();
		System.out.print("Height? ");
		double height = sc.nextDouble();
		
		AbstractShape ret = new Rectangle(Color.BLUE, width, height);
				
		ret.area();
		
		System.out.println();
		System.out.println("Rectangle color: " + ret.getColor());
		System.out.println(ret);
		System.out.println();

		System.out.println("Enter circle data");
		System.out.print("Radius? ");
		double radius = sc.nextDouble();
		
		Circle circle = new Circle(Color.RED, radius);
		circle.area();

		System.out.println();
		System.out.println("Circle color: " + circle.getColor());
		System.out.println(circle);
		
		sc.close();
	}
}
