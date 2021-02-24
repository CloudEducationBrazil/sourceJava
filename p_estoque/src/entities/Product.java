package entities;

public class Product {
	private String name;
	private double quantity;
	private double price;
	
	// Constructor Padrão
	public Product() {
	}
	
	// Constructor
	public Product (String name, double quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}	

	// Constructor Sobrecarga
	public Product (String name, double price) {
		this.name = name;
		this.quantity = 0;
		this.price = price;
	}

	// Acesso a atributos protegidos
	public String getName() {
		return name;
	}
	
	// Acesso a atributos protegidos
	public String setName(String name) {
		return this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	// Acesso a atributos protegidos
	public double setName(double price) {
		return this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public double totalValueStock(double qtdProduct, double price) {
		return qtdProduct * price;
	}

	public void addProducts(double quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(double quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return  "Name: " + name + ", " +
				"Quantity: " + quantity + ", " +
				"Price $: " + String.format("%.2f", price) + ", " +
				" units, Total $: " + String.format("%.2f", totalValueStock(quantity, price));
	}
}
