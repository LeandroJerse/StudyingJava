package entities;

import java.util.Arrays;

public class Circle {
	private String circle;
	private Double[] coordinates = new Double[2];
	private Double radius;
	
	public Circle(String circle,double x,double y, Double radius) {
		super();
		this.circle = circle;
		this.coordinates[0] = x;
		this.coordinates[1]=y;
		this.radius = radius;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public double diameter() {
		return radius*radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2)/2;
	}
	
	public double circunferece() {
		return 2*Math.PI*radius;
	}

	public String toString() {
		return "Name Circle =" + getCircle() + "\n Coordinates x,y =" + getCoordinates()[0]+","+ getCoordinates()[1]
				+ "\n Raidius =" + getRadius() + "\n Diameter =" + String.format("%.2f", diameter()) + "\n Area =" + String.format("%.2f", area())
				+ "\n Circunferece=" + String.format("%.2f", circunferece());
	}
	
	
	
	
	
	

}
