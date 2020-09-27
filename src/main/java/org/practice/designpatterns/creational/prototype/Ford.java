package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class Ford extends Car {

	public Ford() {
		super("Ford", 2_00_000.0D);
	}

	public Ford(Ford o) {
		super(o.getName(), o.getPrice());
	}
	
	

	@Override
	public Car clone() {
		return new Ford(this);
	}

	@Override
	public void drive() {
		System.out.println("driving a ford");
	}

}
