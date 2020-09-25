package org.practice.designpatterns.designprinciples.interfacesegregationprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Jumper implements JumpingAthelete {

	@Override
	public void compete() {
		System.out.println("competing against a jumper");
	}

	@Override
	public void jump() {
		System.out.println("jumping");
	}

}
