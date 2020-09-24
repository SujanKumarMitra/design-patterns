package org.practice.designpatterns.designprinciples.openclosedprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
