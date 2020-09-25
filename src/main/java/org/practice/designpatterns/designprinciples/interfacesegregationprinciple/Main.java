package org.practice.designpatterns.designprinciples.interfacesegregationprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {
	public static void main(String[] args) {
		JumpingAthelete jumpingAthelete = new Jumper();
		jumpingAthelete.compete();
		jumpingAthelete.jump();
		SwimmingAthelete swimmingAthelete = new Swimmer();
		swimmingAthelete.compete();
		swimmingAthelete.swim();
	}
}
