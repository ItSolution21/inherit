package com.inherit;

public class Animal {
	
	public void eat() {
		System.out.println("This is eat method....");
	}
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("Bark method.....");
	}
}

class BabyDog extends Dog{
	
	public void weep() {
		System.out.println("This is weep method.....");
	}
}
