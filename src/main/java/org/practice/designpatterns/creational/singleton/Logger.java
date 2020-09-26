package org.practice.designpatterns.creational.singleton;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Logger {

	private Logger() {
	}

	private static class LoggerFactory { // lazy evaluation + thread safe
		private static final Logger instance;
		static {
			instance = new Logger();
		}
	}

	public static Logger getInstance() {
		return LoggerFactory.instance;
	}

	public void logConsole(String msg) {
		System.out.println("Logging in console:: " + msg);
	}

	public void logFile(String msg) {
		System.out.println("Logging in file:: " + msg);

	}

	public void logDB(String msg) {
		System.out.println("Logging in db:: " + msg);
	}
}
