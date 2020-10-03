package org.practice.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Broker {
	private List<Order> orders;

	public Broker() {
		orders = new ArrayList<>();
	}

	public void takeOrder(Order order) {
		orders.add(order);
	}

	public void placeOrders() {
		orders.forEach(Order::execute);
		orders.clear();
	}
}
