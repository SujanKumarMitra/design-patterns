package org.practice.designpatterns.behavioural.memento;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 */
public class Main {
	public static void main(String[] args) {
		Caretaker<Originator> careTaker = new OriginatorCaretaker();
		Originator object = new Originator(1, "state#1");
		
		System.out.println(object);
		System.out.println("saving state");
		careTaker.save(object.save());

		System.out.println("\nmodifying state");
		object.setFoo(2);
		object.setBar("state#2");
		
		System.out.println(object);
		System.out.println("saving state");
		careTaker.save(object.save());

		System.out.println("\nmodifying state");
		object.setFoo(3);
		object.setBar("state#3");
		System.out.println(object);

		System.out.println("\nrestoring previous state");
		object.restore(careTaker.retrieve());
		System.out.println(object);
		
		System.out.println("\nrestoring previous state");
		object.restore(careTaker.retrieve());
		System.out.println(object);
	}
}
