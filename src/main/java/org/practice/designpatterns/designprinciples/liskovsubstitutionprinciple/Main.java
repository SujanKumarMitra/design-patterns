package org.practice.designpatterns.designprinciples.liskovsubstitutionprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = null;
		vehicle = new Car();
		System.out.println("Capacity : " + vehicle.getFuelCapacity());
		vehicle.start();
		System.out.println("Speed : " + vehicle.getSpeed());
		vehicle = new Bike();
		System.out.println("Capacity : " + vehicle.getFuelCapacity());
		vehicle.start();
		System.out.println("Speed : " + vehicle.getSpeed());
	}

}
