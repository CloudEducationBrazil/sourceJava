package entities;

// eliminou o:
// implments Comparable<T>, pois será substituído na classe por Comparator, expressões lambdas na
// classe da camada application, para ordenadar uma lista com dependência Comparable
// E eliminou a implementação do método Comparable<T>. Comprable<T> eh uma interface
public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// Trabalha com o parametro p do tipo Product para acessar o atributo price
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 900.0;
	}

	// Trabalha com o atributo price direto da Classe
	public boolean nonStaticProductPredicate() {
		return price >= 900.0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}