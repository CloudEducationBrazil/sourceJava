package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.InterfaceShape;

public class Program {

	public static void main(String[] args) {
		
		List<InterfaceShape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0, 2.0));
		System.out.println("Área Rectangle myShape: " + String.format("%.3f", 3.00 * 2.00));
		myShapes.add(new Circle(2.0));
		System.out.println("Área Circle myShape: " + String.format("%.3f", Math.PI * 2.00 * 2.0));
		
		System.out.println("Total área Rectangle/Circle myShape: " + String.format("%.3f", totalArea(myShapes)));
		System.out.println();
		
		List<Circle> myCircles = new ArrayList<>();
		
		myCircles.add(new Circle(2.0));
		System.out.println("Área Circle myCircles: " + String.format("%.3f", Math.PI * 2.00 * 2.0));
		myCircles.add(new Circle(3.0));
		System.out.println("Área Circle: myCircles: " + String.format("%.3f", Math.PI * 3.00 * 3.0));

		System.out.println("Total área MyCircles: " + String.format("%.3f", totalArea(myCircles)) );
		
		// get/put
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		System.out.println();
		copy(myInts, myObjs);
		System.out.print("myInts: " );
		printList(myObjs);

		System.out.println();
		System.out.println();
		copy(myDoubles, myObjs);
		System.out.print("myDoubles: ");
		printList(myObjs);
		
		System.out.println();
		System.out.println();
		System.out.println(myObjs);	
		
		//////// Princípio get/put covariância - extends
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);
		System.out.println();
		System.out.println("Lista insList x= " + x);
		
		// extends - operação de get é permitido
		// put(add) - Não é permitido. Erro de Compilação. 
		//list.add(20);
		
		List<Object> myObjs2 = new ArrayList<Object>();
		myObjs2.add("Maria");
		myObjs2.add("Juju");
		
		List<? super Number> myNums = myObjs2;
		myNums.add(10);
		myNums.add(3.14);
		
		// super - operação de get NÃO é permitida. Erro de Compilação.
		// put(add) - É permitido.
		//Number x = myNums.get(0);
		System.out.println();
		System.out.println(myNums);
	}

	// Covariância - List<? extends Number> source
	// Contravariância - List<? super Number> target
	public static void copy( List<? extends Number> source, List<? super Number> target) {
	    for(Number number : source) {
	        target.add(number);
	    }
	}
	
	public static double totalArea(List<? extends InterfaceShape> list) {
		double sum = 0.0;
		for (InterfaceShape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
	public static void printList(List<? extends Object> list ) {
		for ( Object obj : list) {
			System.out.print(obj + " ");
		}
	}
}