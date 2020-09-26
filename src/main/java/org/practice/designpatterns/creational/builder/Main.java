package org.practice.designpatterns.creational.builder;

import org.practice.designpatterns.creational.builder.mealbuilder.Director;
import org.practice.designpatterns.creational.builder.mealbuilder.MealBuilder;
import org.practice.designpatterns.creational.builder.mealbuilder.NonVegMealBuilder;
import org.practice.designpatterns.creational.builder.mealbuilder.VegMealBuilder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Main {
	public static void main(String[] args) {
		Director director = new Director();

		MealBuilder mealBuider;
		Meal meal;

		mealBuider = new VegMealBuilder();
		director.construct(mealBuider);

		meal = mealBuider.getMeal();
		meal.showItems();
		meal.getCost();
		
		System.out.println("----------------------");
		
		mealBuider = new NonVegMealBuilder();
		director.construct(mealBuider);
		
		meal = mealBuider.getMeal();
		meal.showItems();
		meal.getCost();
	}
}
