package org.practice.designpatterns.designprinciples.liskovsubstitutionprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("car started");
	}

	@Override
	public int getSpeed() {
		return 80;
	}

	@Override
	public int getFuelCapacity() {
		return 20;
	}

}
