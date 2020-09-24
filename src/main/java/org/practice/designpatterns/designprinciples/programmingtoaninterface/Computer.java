package org.practice.designpatterns.designprinciples.programmingtoaninterface;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Computer {
	private DisplayModule displayModule;

	public void setDisplayModule(DisplayModule displayModule) {
		this.displayModule = displayModule;
	}

	public void display() {
		displayModule.display();
	}

}
