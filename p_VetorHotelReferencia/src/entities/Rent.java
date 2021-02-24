package entities;

public class Rent {
	private String name;
	private String email;
	private int room;
	private double price;
	
	public Rent(String name, String email, int room, double price) {
		this.name = name;
		this.email = email;
		this.room = room;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
