package org.practice.designpatterns.creational.abstractfactory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {
	public static void main(String[] args) {
		AbstractButtonFactory buttonFactory = null;
		Button button = null;
		
		buttonFactory = ButtonFactoryProducer.getButtonFactory();
		button = buttonFactory.createButton();
		button.click();

	}
}
