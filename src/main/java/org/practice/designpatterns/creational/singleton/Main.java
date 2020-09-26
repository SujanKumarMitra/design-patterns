package org.practice.designpatterns.creational.singleton;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class Main {
	public static void main(String[] args) {
		String msg = "This is a message";
		Logger logger = Logger.getInstance();
		logger.logConsole(msg);
		logger.logFile(msg);
		logger.logDB(msg);
	}
}
