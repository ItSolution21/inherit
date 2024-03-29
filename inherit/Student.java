package com.inherit;

public class Student extends Person {
	
	int rollno;
	
	public void StudentRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println(rollno);
	}
}
