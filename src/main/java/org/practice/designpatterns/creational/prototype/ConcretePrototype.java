package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class ConcretePrototype extends Prototype {
	
	
	public ConcretePrototype(String color) {
		super(color);
	}

	public ConcretePrototype(Prototype o) {
		super(o);
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype(this);
	}

	@Override
	public String toString() {
		return "Prototype [color=" + color + "]";
	}
	
	

}
