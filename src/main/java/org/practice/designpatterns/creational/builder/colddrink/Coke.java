package org.practice.designpatterns.creational.builder.colddrink;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Coke extends ColdDrink {

	@Override
	public String getName() {
		return "Coke";
	}

	@Override
	public double getPrice() {
		return 35.00D;
	}

}
