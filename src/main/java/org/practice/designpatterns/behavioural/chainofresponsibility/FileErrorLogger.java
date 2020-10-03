package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class FileErrorLogger extends ErrorLogger {

	private ErrorLevel loggerLevel;
	private ErrorLogger nextLogger;

	public FileErrorLogger() {
		this.loggerLevel = ErrorLevel.DEBUG;
		this.nextLogger = new DBErrorLogger();
	}

	@Override
	protected void log(ErrorMessage message) {
		System.err.println("DEBUG::" + message.getMessage());
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
