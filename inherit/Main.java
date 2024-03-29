package com.inherit;

public class Main {
	
	public static void main(String[] args) {
//		
//		Animal an = new Animal();
//		an.eat();
//		
//		System.out.println("******************************");
//		Dog dg = new Dog();
//		dg.eat();
//		dg.bark();
//		
//		System.out.println("***************************************");
//		BabyDog bd = new BabyDog();
//		bd.bark();
//		bd.eat();
//		bd.weep();
		
		
		Person pt = new Person();
		pt.addPersonDetails("rahul", 23);
		pt.displayPerson();
		
		
		System.out.println("*************************");
		Student st = new Student();
		st.addPersonDetails("kabir", 22);
		st.StudentRollno(21);
		st.displayPerson();
		st.display();
		
		System.out.println("****************************");
		Teacher tc = new Teacher();
		tc.addPersonDetails("rohan", 34);
		tc.addCourse("B.ed");
		tc.displayPerson();
		tc.displayCourse();
		
	}
}
