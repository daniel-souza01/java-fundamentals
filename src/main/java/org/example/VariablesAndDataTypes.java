package org.example;

public class VariablesAndDataTypes {
	public static void main(String[] args) {
		// type varName = value;
		String name = "Daniel";
		System.out.println(name);

		// type varName;
		int age;
		age = 21;
		System.out.println(age);

		// type varName = value, varName = value;
		int a = 1, b = 2, c = 3;
		a = b = c = 10;
		System.out.println(a + b + c);

		// var varName = value
		var year = 2024;
		System.out.println(year);
	}

	public void dataTypes() {
		// Primitive: byte, short, int, long, float, double, boolean and char
		byte myByte = 127;
		short myShort = 32767;
		int myInt = 2147483647; // most used for integer
		long myLong = 9223372036854775807L;
		float myFloat = 10.1234567f;
		double myDouble = 10.123456789101112131415d; // most used for floating
		boolean myBool = true;
		char myChar = 'D';

		// Non-primitive: Strings, Arrays, Classes, Interface...
		String myString = "Daniel";
	}

	public void typeCasting() {
		// automatically
		int myInt = 9;
		double myDouble = myInt; // int to double
		System.out.println(myInt);
		System.out.println(myDouble);

		// manually
		double myDoubleTwo = 9.12d;
		int myIntTwo = (int) myDoubleTwo; // double to int
		System.out.println(myDoubleTwo);
		System.out.println(myIntTwo);
	}

	public void operators() {
		// Arithmetic
		int sum = 100 + 100;
		int sub = 10 - 2;
		int mult = 5 * 5;
		int divis = 150 / 2;
		int modulus = 11 % 10;
		int x = 10, y = 10;
		int increment = ++x;
		int decrement = --y;
		System.out.println("Arithmetic operators:");
		System.out.println("sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mult: " + mult);
		System.out.println("divis: " + divis);
		System.out.println("modulus: " + modulus);
		System.out.println("increment: " + increment);
		System.out.println("decrement: " + decrement);

		// Assignment
		int assignment = 10;
		assignment += 5;
		System.out.println("\n" + "Assignment operators:");
		System.out.println("addition assignment: " + assignment);

		// Comparison (==, !=, >, <, >=, <=)
		int a = 1;
		int b = 2;
		System.out.println("\n" + "Comparison operators:");
		System.out.println(a <= b);

		// Logical (&&, ||, !)
		int c = 10;
		System.out.println("\n" + "Comparison operators:");
		System.out.println(c > 1 && c < 11);
	}

	public void arrays() {
		System.out.println("arrays:");
		int[] numbers = {10, 20, 30};
		numbers[2] = 31;
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers.length);

		System.out.println("\nmulti-dimensional arrays:");
		int[][] numbersArray = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(numbersArray[1][2]);
	}
}