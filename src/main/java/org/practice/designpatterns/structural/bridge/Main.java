package org.practice.designpatterns.structural.bridge;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Main {
	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		Shape rectangle = new Rectangle(new GreenColor());
		
		triangle.drawShape();
		rectangle.drawShape();
		
	}
}
