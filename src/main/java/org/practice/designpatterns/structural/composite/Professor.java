package org.practice.designpatterns.structural.composite;

import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Professor implements Faculty {

	String name;
	String subject;

	public Professor(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", subject=" + subject + "]";
	}

	@Override
	public String getDetails() {
		return toString();
	}

	@Override
	public boolean equals(Faculty faculty) {
		if (faculty == null)
			return false;
		if (!(faculty instanceof Professor))
			return false;
		Professor p = (Professor) faculty;

		return Objects.deepEquals(this, p);
	}

}
