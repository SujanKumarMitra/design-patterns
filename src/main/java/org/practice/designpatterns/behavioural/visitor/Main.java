package org.practice.designpatterns.behavioural.visitor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class Main {
	public static void main(String[] args) {
		ItemElement[] items = getItems();

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static ItemElement[] getItems() {
		ItemElement[] items = new ItemElement[4];
		items[0] = new Book(20, "1234");
		items[1] = new Book(100, "5678");
		items[2] = new Fruit(10, 2, "Banana");
		items[3] = new Fruit(5, 5, "Apple");
		
		return items;
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
