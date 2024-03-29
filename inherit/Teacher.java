package com.inherit;

public class Teacher extends Person {

	String course;
	
	public void addCourse(String course) {
		this.course = course;
	}
	
	public void displayCourse() {
		System.out.println(course);
	}
}
