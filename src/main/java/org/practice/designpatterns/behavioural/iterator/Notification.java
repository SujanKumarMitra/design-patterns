package org.practice.designpatterns.behavioural.iterator;

import java.time.LocalDateTime;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Notification {
	private final String message;
	private final LocalDateTime timeStamp;

	public Notification(String message) {
		this.message = message;
		this.timeStamp = LocalDateTime.now();
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	@Override
	public String toString() {
		return "message:: " + message + ", arrived at:: " + timeStamp;
	}

}
