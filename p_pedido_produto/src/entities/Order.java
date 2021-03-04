package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import entities.enums.OrderStatus;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;

	// Composição/Associação - Relacionamentos entre os objetos; UML composição(todo-parte)
	// Composição Tem-Um - Associação de um objeto conter outro
	private Client client;
	
	// Coleção - Composição Tem-Vários - Associação de um objeto conter outro
	// List eh uma interface não pode instanciar
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0;

		for (OrderItem item : items) {
			sum += item.subTotal();
		}

		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append(client.toString() + "\n");
		sb.append("Order items: \n");

		// System.out.println("Size List: " + items.size());

		for (OrderItem i : items) {
			// Poderia criar o método toString na Classe OrderItem
			// sb.append(item + "\n");
			
			sb.append(i.getProduct().getName() + ", $" + String.format("%.2f", i.getPrice()) + ", Quantity: "
					+ i.getQuantity() + ", SubTotal: $" + String.format("%.2f", i.subTotal()) + "\n");
		}

		sb.append("Total price: $" + String.format("%.2f", total()));

		return sb.toString();
	}
}
