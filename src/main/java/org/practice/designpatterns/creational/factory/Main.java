package org.practice.designpatterns.creational.factory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape = null;
		shape = factory.getShape("circle");
		shape.draw();
		shape = factory.getShape("rectangle");
		shape.draw();
		shape = factory.getShape("square");
		shape.draw();
	}
}
