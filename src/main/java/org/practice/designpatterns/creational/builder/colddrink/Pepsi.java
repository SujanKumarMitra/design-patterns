package org.practice.designpatterns.creational.builder.colddrink;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Pepsi extends ColdDrink {

	@Override
	public String getName() {
		return "Pepsi";
	}

	@Override
	public double getPrice() {
		return 40.00D;
	}

}
