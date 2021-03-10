package entities;

public class Rectangle extends AbstractShape {
	
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	};

	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area()=" + area() + "]";
	}
}
