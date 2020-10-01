package org.practice.designpatterns.structural.facade;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-01
 */
public class HotelKeeper {

	private Hotel vegRestaurant;
	private Hotel nonVegRestaurant;

	public HotelKeeper() {
		vegRestaurant = new VegRestaurant();
		nonVegRestaurant = new NonVegRestaurant();
	}

	public Menu getVegMenu() {
		return vegRestaurant.getMenu();
	}

	public Menu getNonVegMenu() {
		return nonVegRestaurant.getMenu();
	}
}
