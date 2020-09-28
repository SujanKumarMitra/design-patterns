package org.practice.designpatterns.structural.bridge;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void drawShape();
	
	public abstract void modifyBorder(int border);
}
