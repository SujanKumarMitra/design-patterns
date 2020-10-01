package org.practice.designpatterns.structural.facade;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-01
 */
public class NonVegRestaurant implements Hotel {

	private Menu menu;
	
	public NonVegRestaurant() {
		menu = new NonVegMenu();
	}

	@Override
	public Menu getMenu() {
		return menu;
	}

}
