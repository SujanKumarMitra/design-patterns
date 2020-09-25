package org.practice.designpatterns.designprinciples.dependencyinjection;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class ConsoleLoggerService implements LoggerService {

	@Override
	public void log(String msg) {
		System.out.println("logging in console:: " + msg);
	}

}
