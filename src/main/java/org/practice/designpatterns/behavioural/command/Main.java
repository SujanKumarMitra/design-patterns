package org.practice.designpatterns.behavioural.command;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Main {
	public static void main(String[] args) {
		Broker broker = new Broker();
		Stock stock = new Stock("Google", 100);
		
		broker.takeOrder(new BuyStock(stock));
		broker.takeOrder(new SellStock(stock));
		
		broker.placeOrders();
		
	}
}
