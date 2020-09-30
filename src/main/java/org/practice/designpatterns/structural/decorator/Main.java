package org.practice.designpatterns.structural.decorator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-30
 */
public class Main {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		rectangle.draw();
		circle.draw();
		
		System.out.println();

		ShapeDecorator decorator = new RedShapeDecorator(rectangle);
		decorator.draw();
		decorator.setBorder();

		System.out.println();

		decorator = new GreenShapeDecorator(circle);
		decorator.draw();
		decorator.setBorder();

	}
}
