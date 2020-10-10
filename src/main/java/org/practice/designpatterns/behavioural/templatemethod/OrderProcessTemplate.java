package org.practice.designpatterns.behavioural.templatemethod;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-10
 */
public abstract class OrderProcessTemplate {

	public final void giftWrap() {
		System.out.println("Gift wrap successfull");
	}

	public abstract void doSelect();

	public abstract void doPayment();

	public abstract void doDelivery();

	public final void processOrder(boolean isGift) {
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}

}
