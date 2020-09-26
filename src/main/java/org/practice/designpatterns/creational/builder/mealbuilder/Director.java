package org.practice.designpatterns.creational.builder.mealbuilder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Director {

	public void construct(MealBuilder mealBuilder) {
		mealBuilder.buildBurger();
		mealBuilder.buildDrink();
	}
}
