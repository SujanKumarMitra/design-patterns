package org.practice.designpatterns.designprinciples.interfacesegregationprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Swimmer implements SwimmingAthelete {

	@Override
	public void compete() {
		System.out.println("competing against a swimmer");
	}

	@Override
	public void swim() {
		System.out.println("swimming");

	}

}
