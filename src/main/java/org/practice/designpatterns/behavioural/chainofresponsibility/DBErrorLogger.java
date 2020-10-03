package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class DBErrorLogger extends ErrorLogger {

	private ErrorLevel loggerLevel;
	private ErrorLogger nextLogger;

	public DBErrorLogger() {
		this.loggerLevel = ErrorLevel.ERROR;
	}

	@Override
	protected void log(ErrorMessage message) {
		System.err.println("ERROR::" + message.getMessage());
	}

	@Override
	protected ErrorLogger getNextLogger() {
		return nextLogger;
	}

	@Override
	public ErrorLevel getLoggerLevel() {
		return loggerLevel;
	}

}
