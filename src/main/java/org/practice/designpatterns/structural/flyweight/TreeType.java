package org.practice.designpatterns.structural.flyweight;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class TreeType {
	private final String name;
	private final String color;

	public TreeType(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "TreeType [name=" + name + ", color=" + color + "]";
	}

}
