package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class Main {

	public static void main(String[] args) {
		CarCache cache = new CarCache();
		Car ford = cache.getCar("ford");
		Car nano = cache.getCar("nano");
		
		System.out.println(ford);
		System.out.println(nano);

		ford.drive();
		nano.drive();
		
	}
}
