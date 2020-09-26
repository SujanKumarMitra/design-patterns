package org.practice.designpatterns.creational.prototype;

public abstract class Prototype {

	String color;
	
	public Prototype(String color) {
		this.color = color;
	}

	public Prototype(Prototype o) {
		this.color = o.color;
	}
	
	public abstract Prototype clone();
}
