package org.practice.designpatterns.structural.decorator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-30
 */
public abstract class ShapeDecorator implements Shape {
	Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
	}

	public abstract void setBorder();

}
