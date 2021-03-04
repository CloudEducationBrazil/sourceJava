package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class PedidoProduto {

	public static void main(String[] args) throws ParseException {
		// Correção: https://www.youtube.com/watch?v=gj80JEqk5ms
		// https://github.com/acenelio/composition3-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Rotina de Pedido de Produto");
		System.out.println();
		
		// Dados do Cliente
		System.out.println("****** Enter client data ******");
		System.out.println();
		
		System.out.print("Name? ");
		String name = sc.nextLine();
		
		System.out.print("Email? ");
		String email = sc.nextLine();		
		
		System.out.print("Birth date (dd/MM/yyyy)? ");
		Date birthDate = sdf.parse(sc.next());
		
		// Gravando o Client
		Client client = new Client(name, email, birthDate);
		
		// Status do Pedido
		System.out.println();
		System.out.println("****** Enter order data ******");

		System.out.print("Status? ");
		String status = sc.next();
		OrderStatus orderStatus = OrderStatus.valueOf(status);
		// OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), orderStatus, client);
		
		// Quantidade de Produtos
		System.out.println();
		System.out.print("How many items to this order? ");
		int qtdProducts = sc.nextInt();
		
		// Dados de Produtos
		for (int x= 0; x < qtdProducts; x++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Enter #" + (x + 1) + " item data:");
			
			System.out.print("Prodcut name? ");
			String nameProduct = sc.nextLine();
			
			System.out.print("Product price? ");
			Double priceProduct = sc.nextDouble();
			
			System.out.print("Quantity? ");
			Integer quantityProduct = sc.nextInt();
			
			// Gravando o Product
			Product product = new Product(nameProduct, priceProduct);
			
			// Gravando os Items
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
			
			// Gravando os itens do Pedido
			order.addItem(orderItem);
		}
		
		System.out.println();
		//System.out.println(order.toString()); ou
		System.out.println(order);
		
		sc.close();
	}
}
