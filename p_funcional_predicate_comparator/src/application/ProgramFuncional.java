package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
//import util.ProductPredicate;

public class ProgramFuncional {

	public static void main(String[] args) {
		// https://github.com/acenelio/lambda2-java
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//Fazer um programa que, a partir de uma lista de produtos, remova da
		//lista somente aqueles cujo preço mínimo seja 100.		
		
		// Interface funcional Predicado
		//list.removeIf(p-> p.getPrice() >= 900.0);
		
		// Ou Assim, Implementação da Interface
		// usando Interface com Predicado do package Util
		//list.removeIf(new ProductPredicate());
		
		// Ou Assim, Reference Method com método ESTÁTICO 
		// criando um método static na class Product
		// Acessando um método direto da Classe, através do nome da Classe Product::
		// Methods reference, referência para método
		//list.removeIf(Product::staticProductPredicate);
		
		// Ou Assim, Reference Method com método NÃO estático 
		// referência para método, acesso price direto da classe
		//list.removeIf(Product::nonStaticProductPredicate);
		
		// Ou Assim, expressão lambda declarada
		//double min = 900.0; // Pode ser solicitado pelo usuário, Scanner
		//Predicate<Product> pred = p -> p.getPrice() >= min; // Parametrizavel
		//list.removeIf(pred);
		
		// Ou Assim, expressão lambda inline
		double min = 900.0; // Pode ser solicitado pelo usuário, Scanner. Parametrizavel
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}