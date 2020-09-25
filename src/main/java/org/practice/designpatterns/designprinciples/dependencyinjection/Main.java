package org.practice.designpatterns.designprinciples.dependencyinjection;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {
	public static void main(String[] args) {
		// constructor injection
		Component component = new Component(new ConsoleLoggerService());
		component.compute();
		// setter injection
		component.setLoggerService(new FileLoggerService());
		component.compute();
	}
}
