package org.example;

public class Conditionals {
	public static void main(String[] args) {
		// if, else, else if
		int time = 11;
		if (time >= 18) {
			System.out.println("is night");
		} else if (time >= 12) {
			System.out.println("is afternoon");
		} else {
			System.out.println("is day");
		}

		// Ternary Operator
		int timeTwo = 19;
		String result = timeTwo >= 18 ? "night" : "day";
		System.out.println(result);

		// switch
		int day = 2;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("is another day");
		}
	}
}
