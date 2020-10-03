package org.practice.designpatterns.behavioural.command;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Stock {
	private final String name;
	private final int quantity;

	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", quantity=" + quantity + "]";
	}

	public void buy() {
		System.out.println(toString() + " bought");
	}

	public void sell() {
		System.out.println(toString() + " sold");
	}
}
