package org.practice.designpatterns.designprinciples.openclosedprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Rectangle implements Shape {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return length * breadth;
	}

}
