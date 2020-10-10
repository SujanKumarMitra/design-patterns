package org.practice.designpatterns.behavioural.templatemethod;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class Main {
	public static void main(String[] args) {
		OrderProcessTemplate netOrder = new NetOrder();
		OrderProcessTemplate storeOrder = new StoreOrder();
		
		netOrder.processOrder(true);
		System.out.println();
		storeOrder.processOrder(true);
	}
}
