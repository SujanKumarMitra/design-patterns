package org.practice.designpatterns.creational.abstractfactory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class LinuxButtonFactory extends AbstractButtonFactory {

	@Override
	protected Button createButton() {
		return new LinuxButton();
	}
}
