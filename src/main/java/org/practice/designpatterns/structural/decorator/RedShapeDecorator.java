package org.practice.designpatterns.structural.decorator;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-30
 */
public class RedShapeDecorator extends ShapeDecorator {

	public String color;

	public RedShapeDecorator(Shape shape) {
		super(shape);
		this.color = "red";
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Color is " + color);
	}
	
	@Override
	public void setBorder() {
		System.out.println("Border set to " + color);
	}

}
