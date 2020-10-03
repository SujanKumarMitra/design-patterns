package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class ConsoleErrorLogger extends ErrorLogger {

	private ErrorLevel loggerLevel;
	private ErrorLogger nextLogger;

	public ConsoleErrorLogger() {
		this.loggerLevel = ErrorLevel.INFO;
		this.nextLogger = new FileErrorLogger();
	}

	@Override
	protected void log(ErrorMessage message) {
		System.err.println("INFO::" + message.getMessage());
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
