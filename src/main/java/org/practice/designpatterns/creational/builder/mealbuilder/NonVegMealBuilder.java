package org.practice.designpatterns.creational.builder.mealbuilder;

import org.practice.designpatterns.creational.builder.Meal;
import org.practice.designpatterns.creational.builder.burger.ChickenBurger;
import org.practice.designpatterns.creational.builder.colddrink.Pepsi;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class NonVegMealBuilder implements MealBuilder {

	private Meal meal;

	public NonVegMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildBurger() {
		meal.addItem(new ChickenBurger());
	}

	@Override
	public void buildDrink() {
		meal.addItem(new Pepsi());
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
