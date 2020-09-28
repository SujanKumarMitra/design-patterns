package org.practice.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Supervisor implements Faculty {

	protected String name;
	protected String position;
	protected List<Faculty> faculties;

	public Supervisor(String name, String position) {
		this.name = name;
		this.position = position;
		this.faculties = new ArrayList<>();
	}

	public void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}

	public void removeFaculty(Faculty faculty) {
		faculties.remove(faculty);
	}

	public List<Faculty> getFaculties() {
		return faculties;
	}

	@Override
	public String getDetails() {
		return toString();
	}

	@Override
	public String toString() {
		return "Supervisor [name=" + name + ", position=" + position + "]";
	}

	@Override
	public boolean equals(Faculty faculty) {
		if (faculty == null)
			return false;
		if (!(faculty instanceof Supervisor))
			return false;
		Supervisor s = (Supervisor) faculty;

		return Objects.deepEquals(this, s);
	}

}
