package org.practice.designpatterns.structural.facade;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-01
 */
public class VegRestaurant implements Hotel {

	private Menu menu;
	
	public VegRestaurant() {
		menu = new VegMenu();
	}

	@Override
	public Menu getMenu() {
		return menu;
	}

}
