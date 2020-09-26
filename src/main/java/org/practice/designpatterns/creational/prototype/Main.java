package org.practice.designpatterns.creational.prototype;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Main {
	public static void main(String[] args) {
		Prototype p = new ConcretePrototype("red");
		System.out.println(p);
		Prototype clone = p.clone();
		System.out.println(clone);
	}
}
