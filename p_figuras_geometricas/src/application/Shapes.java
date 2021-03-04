package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Shapes {

	public static void main(String[] args) {
		// https://github.com/acenelio/inheritance7-java
		//https://www.youtube.com/watch?v=eDsS3JM5iXw
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.println("********* Sistemas de Figuras Geométricas ********* ");
		System.out.println();
		
		System.out.print("Enter the number of shapes? ");
		int quantityShape = sc.nextInt();
		
		for (int x = 0; x < quantityShape ; x++) {
			System.out.println("Shape #" + (x+1) + " data:");
			System.out.print("Rectengle (r) or Circle (c)? ");
			char response = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.next());
			
			if ( response == 'r' || response == 'R' ) {
				System.out.print("Width? ");
				Double width = sc.nextDouble();
				
				sc.nextLine();
				System.out.print("height? ");
				Double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius? ");
				Double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape sp : list) {
			System.out.println(String.format("%.2f", sp.area()));
		}
			
		sc.close();
	}
}
