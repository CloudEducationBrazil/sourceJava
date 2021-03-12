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
		//lista somente aqueles cujo pre�o m�nimo seja 100.		
		
		// Interface funcional Predicado
		//list.removeIf(p-> p.getPrice() >= 900.0);
		
		// Ou Assim, Implementa��o da Interface
		// usando Interface com Predicado do package Util
		//list.removeIf(new ProductPredicate());
		
		// Ou Assim, Reference Method com m�todo EST�TICO 
		// criando um m�todo static na class Product
		// Acessando um m�todo direto da Classe, atrav�s do nome da Classe Product::
		// Methods reference, refer�ncia para m�todo
		//list.removeIf(Product::staticProductPredicate);
		
		// Ou Assim, Reference Method com m�todo N�O est�tico 
		// refer�ncia para m�todo, acesso price direto da classe
		//list.removeIf(Product::nonStaticProductPredicate);
		
		// Ou Assim, express�o lambda declarada
		//double min = 900.0; // Pode ser solicitado pelo usu�rio, Scanner
		//Predicate<Product> pred = p -> p.getPrice() >= min; // Parametrizavel
		//list.removeIf(pred);
		
		// Ou Assim, express�o lambda inline
		double min = 900.0; // Pode ser solicitado pelo usu�rio, Scanner. Parametrizavel
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}