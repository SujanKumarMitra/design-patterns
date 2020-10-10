package org.practice.designpatterns.behavioural.templatemethod;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public class StoreOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		System.out.println("Customer chooses item from the shelf");
	}

	@Override
	public void doPayment() {
		System.out.println("Pays at counter through cash/POS");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered to in the delivery counter");
	}

}
