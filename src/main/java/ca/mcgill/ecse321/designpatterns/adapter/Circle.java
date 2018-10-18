package ca.mcgill.ecse321.designpatterns.adapter;

public class Circle {
	public void draw(int x, int y, int radius) {
		System.out.println("Circle with centre at (" + x
				+ ";" + y + "), with a radius of " + radius);
	}
}
