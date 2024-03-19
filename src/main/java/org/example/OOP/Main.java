package org.example.OOP;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(1969, "Mustang", "Black");
		System.out.println(car.year);
		System.out.println(car.model);
		System.out.println(car.color);
	}
}