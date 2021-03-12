package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class InterfaceConsumer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mosue", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		// Interface funcional Consumer
		//list.forEach(new PriceUpdate());
		
		// Reference Method com método ESTÁTICO
		// list.forEach(Product::staticPriceUpdateConsumer);
		
		// Reference Method com método NÃO estático 
		// list.forEach(Product::nonStaticPriceUpdateConsumer);
		
		// Expressão lambda declarada
		//double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); // Parametrizavel
		//list.forEach(cons);		// Expressão lambda declarada

		// Expressão lambda inline
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		// imprimindo a lista
		list.forEach(System.out::println);
		
	}
}