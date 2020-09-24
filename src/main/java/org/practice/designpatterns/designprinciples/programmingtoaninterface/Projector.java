package org.practice.designpatterns.designprinciples.programmingtoaninterface;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Projector implements DisplayModule {

	@Override
	public void display() {
		System.out.println("Displaying through a projector");
	}

}
