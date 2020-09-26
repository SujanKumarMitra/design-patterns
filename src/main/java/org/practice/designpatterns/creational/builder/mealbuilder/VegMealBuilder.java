package org.practice.designpatterns.creational.builder.mealbuilder;

import org.practice.designpatterns.creational.builder.Meal;
import org.practice.designpatterns.creational.builder.burger.VegBurger;
import org.practice.designpatterns.creational.builder.colddrink.Coke;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class VegMealBuilder implements MealBuilder {

	private Meal meal;

	public VegMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildBurger() {
		meal.addItem(new VegBurger());
	}

	@Override
	public void buildDrink() {
		meal.addItem(new Coke());
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
