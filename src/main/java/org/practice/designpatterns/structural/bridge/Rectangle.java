package org.practice.designpatterns.structural.bridge;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Rectangle extends Shape {

	protected int border;

	public Rectangle(Color color) {
		super(color);
		this.border = 15;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a rectangle");
		super.color.fillWithColor(border);
	}

	@Override
	public void modifyBorder(int border) {
		this.border = border;
	}

}
