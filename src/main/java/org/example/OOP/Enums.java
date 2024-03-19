package org.example.OOP;

enum Level {
	LOW,
	MEDIUM,
	HIGH
}

public class Enums {
	public static void main(String[] args) {
		Level myLevel = Level.LOW;
		System.out.println(myLevel);

		for (Level l : Level.values()) {
			System.out.println(l);
		}
	}
}