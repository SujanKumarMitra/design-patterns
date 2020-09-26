package org.practice.designpatterns.creational.builder.mealbuilder;

import org.practice.designpatterns.creational.builder.Meal;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public interface MealBuilder {

	void buildBurger();

	void buildDrink();

	Meal getMeal();
}
