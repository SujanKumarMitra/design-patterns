package org.practice.designpatterns.behavioural.memento;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-07
 */
public class MementoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -9184141331492496903L;

	public MementoNotFoundException() {
		super();
	}

	public MementoNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MementoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MementoNotFoundException(String message) {
		super(message);
	}

	public MementoNotFoundException(Throwable cause) {
		super(cause);
	}

}
