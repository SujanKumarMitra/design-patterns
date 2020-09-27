package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class Nano extends Car {

	public Nano() {
		super("Nano", 1_50_000.0D);
	}

	public Nano(Nano o) {
		super(o.getName(), o.getPrice());
	}

	@Override
	public void drive() {
		System.out.println("driving a nano");
	}

	@Override
	public Car clone() {
		return new Nano(this);
	}

}
