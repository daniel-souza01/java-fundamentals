package org.example.OOP;

public class Abstraction {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sleep();
		dog.sound();
	}
}

// cannot be instantiated (must be inherited)
abstract class Animal {
	public abstract void sound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Au au!");
	}
}