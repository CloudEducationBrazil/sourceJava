package entities;

public class Circle extends AbstractShape {
	private double radius;
	
	public Circle() {
		super();
	};
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area () {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + String.format("%,2f", area()) + "]";
	}
}