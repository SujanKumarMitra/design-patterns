package org.practice.designpatterns.behavioural.chainofresponsibility;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public enum ErrorLevel {

	INFO(1), DEBUG(2), ERROR(3);

	int level;

	ErrorLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
