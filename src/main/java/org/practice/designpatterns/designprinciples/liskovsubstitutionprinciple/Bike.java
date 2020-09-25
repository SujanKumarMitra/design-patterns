package org.practice.designpatterns.designprinciples.liskovsubstitutionprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("bike started");
	}

	@Override
	public int getSpeed() {
		return 60;
	}

	@Override
	public int getFuelCapacity() {
		return 5;
	}
	
}
