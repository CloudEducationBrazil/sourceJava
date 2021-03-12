package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class ProgramMap {

	public static void main(String[] args) {
		// TreeMap ordena a estrutra de dados pela chave
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Juju");
		cookies.put("email", "julia@gmail.com");
		cookies.put("phone", "(85)72677861");

		cookies.remove("email");
		
		System.out.println("Contains <phone> key: " + cookies.containsKey("phone"));
		
		// Vai ficar agora o último phone, pois não admite repetição
		cookies.put("phone", "(97)65265213");
		
		System.out.println("Key username: " + cookies.get("username"));	
		
		System.out.println("Size: " + cookies.size());
		
		// Se null, key not exists
		System.out.println("Key email: " + cookies.get("email"));		
		
		System.out.println("ALL COOKIES: ");
		System.out.println();
		for (String key : cookies.keySet()) {
			System.out.println(key + ":" + cookies.get(key));
		}
		System.out.println();
		
		//////////////////////////////////
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		// Será false, pois verifica ponteiro, se não existir o método HashCode na class Product
		// Se existir o método HashCode retornará TRUE
		
		// Pesquisar um produto no Map
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));	
	}
}