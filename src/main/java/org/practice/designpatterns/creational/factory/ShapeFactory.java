package org.practice.designpatterns.creational.factory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class ShapeFactory {

	public Shape getShape(String shape) {
		switch (shape.toUpperCase()) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			return null;
		}
	}
}
