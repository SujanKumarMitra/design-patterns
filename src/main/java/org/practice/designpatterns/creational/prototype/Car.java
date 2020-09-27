package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public abstract class Car {

	protected String name;
	protected double price;

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	public abstract void drive();

	public abstract Car clone();

}
