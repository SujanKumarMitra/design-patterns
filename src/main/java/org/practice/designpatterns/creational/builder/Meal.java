package org.practice.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Meal {

	List<Item> items;

	public Meal() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void getCost() {
		double totalCost = items.stream()
								.mapToDouble(Item::getPrice)
								.sum();
		System.out.println("Total cost: " + totalCost);
	}

	public void showItems() {
		StringBuilder sb = new StringBuilder();
		for (Item item : items) {
			sb	.append("Name: ")
				.append(item.getName())
				.append(", ");

			sb	.append("Packing: ")
				.append(item.getPacking()
							.pack())
				.append(", ");

			sb	.append("Price: ")
				.append(item.getPrice())
				.append("\n");
		}
		System.out.println(sb);
	}
}
