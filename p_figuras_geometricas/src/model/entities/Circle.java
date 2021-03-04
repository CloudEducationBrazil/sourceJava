package model.entities;

import model.enums.Color;

public class Circle extends Shape{
	private static final double pi = 3.141519;
	
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
//		return Math.PI * Math.pow(radius, 2);
		return pi * Math.pow(radius, 2);
	}
}
