package com.is.beans;

import java.util.Set;

public class Course {
	private Set<String> faculties;

	public Course(Set<String> faculties) {
		super();
		this.faculties = faculties;
	}

	public void showFaculties() {
		System.out.println("Faculties: ");
		for (String f : faculties) {
			System.out.println(f);
		}
	}
}
