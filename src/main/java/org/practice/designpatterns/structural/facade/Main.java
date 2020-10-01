package org.practice.designpatterns.structural.facade;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-01
 */
public class Main {
	public static void main(String[] args) {
		HotelKeeper hotelKeeper = new HotelKeeper();
		Menu vegMenu = hotelKeeper.getVegMenu();
		Menu nonVegMenu = hotelKeeper.getNonVegMenu();
		System.out.println(vegMenu.getItems());
		System.out.println(nonVegMenu.getItems());
	}
}
