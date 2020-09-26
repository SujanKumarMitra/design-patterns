package org.practice.designpatterns.creational.builder.burger;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class VegBurger extends Burger {

	@Override
	public String getName() {
		return "VegBurger";
	}

	@Override
	public double getPrice() {
		return 60.00D;
	}

}
