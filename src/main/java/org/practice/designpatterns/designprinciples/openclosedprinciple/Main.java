package org.practice.designpatterns.designprinciples.openclosedprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Main {
	
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(10, 20);
		Shape circle = new Circle(15);
		
		System.out.println("Area of rectangle is " + rectangle.getArea());
		System.out.println("Area of circle is " + circle.getArea());
	}
}
