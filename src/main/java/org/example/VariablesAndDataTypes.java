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
	}
}