package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public abstract class ErrorLogger {

	public abstract ErrorLevel getLoggerLevel();

	protected abstract void log(ErrorMessage message);

	protected abstract ErrorLogger getNextLogger();

	protected void handle(ErrorMessage message) {
		if (message.getLevel().compareTo(getLoggerLevel()) >= 0) {
			log(message);
			ErrorLogger nextLogger = getNextLogger();
			if (nextLogger != null)
				nextLogger.handle(message);
		}
	}
}
