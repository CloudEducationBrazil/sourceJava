package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		// Conjunto Set N�O garante Ordenado
		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		// Opera��o com Set
		//set.remove("Tablet");
		// Usando predicado ->
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		System.out.println();
		
		for (String p : set) {
			System.out.println(p);
		}
		
		// Conjunto Set Ordenado
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");

		System.out.println();
		for (String p : set2) {
			System.out.println(p);
		}
		
		// Conjunto Set mant�m a Ordem em que os elementos s�o inseridos
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		System.out.println();
		for (String p : set3) {
			System.out.println(p);
		}
		
		System.out.println();
		
		// Uni�o; Interse��o; Diferen�a
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//Union
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println("Uni�o " + c);
		System.out.println();
		
		//Interese��o
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println("Interse��o " + d);
		System.out.println();
		
		//Diferen�a
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println("Diferen�a " + e);
		
		// Testar produto na Classe
		Set<Product> set4 = new TreeSet<>(); // HashSet
		set4.add(new Product("TV", 900.0));
		set4.add(new Product("Notebook", 1200.0));
		set4.add(new Product("Tablet", 400.0));

		// Testando se o produto existe na base de dados
		Product prod = new Product("Notebook", 1200.0);

		// Se n�o estiver implementado na Class Product os m�todos hashCode e Equals
		// Ser� analisado a igualdade pela refer�ncia (ponteiro) na mem�ria
		System.out.println("Product contains the item.");
		System.out.println(set4.contains(prod));
		
		for (Product product : set4) {
			System.out.println(product);
		}
	}
}