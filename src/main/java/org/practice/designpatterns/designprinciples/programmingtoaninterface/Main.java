package org.practice.designpatterns.designprinciples.programmingtoaninterface;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setDisplayModule(new Monitor());
		computer.display();
		computer.setDisplayModule(new Projector());
		computer.display();
	}
}
