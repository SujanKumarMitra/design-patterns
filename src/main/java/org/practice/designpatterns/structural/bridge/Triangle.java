package org.practice.designpatterns.structural.bridge;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Triangle extends Shape {

	protected int border;

	public Triangle(Color color) {
		super(color);
		this.border = 10;
	}

	@Override
	public void drawShape() {
		System.out.println("drawing a Triangle");
		color.fillWithColor(border);
	}

	@Override
	public void modifyBorder(int border) {
		this.border = border;
	}

}
