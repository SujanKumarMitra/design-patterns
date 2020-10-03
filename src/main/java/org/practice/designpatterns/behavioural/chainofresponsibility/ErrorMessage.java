package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class ErrorMessage {
	final String message;
	final ErrorLevel level;

	public ErrorMessage(String message, ErrorLevel level) {
		this.message = message;
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public ErrorLevel getLevel() {
		return level;
	}

}
