package org.example.OOP;

public class Interfaces {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sleep();
		cat.sound();
	}
}

interface AnimalInterface {
	public void sound();

	public void sleep();
}

class Cat implements AnimalInterface {
	public void sound() {
		System.out.println("Miau!");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}