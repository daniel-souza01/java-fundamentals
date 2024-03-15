package org.example;

public class Methods {
	public static void main(String[] args) {
		myMethod("daniel", 21);

		int[] num = {15, 15, 15};
		System.out.println(sum(num));

		double[] numTwo = {10.1d, 10.7d};
		System.out.println(sum(numTwo));

		System.out.println(sumRecursion(10));
	}

	static void myMethod(String name, int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);

		// block scope
		{
			int x = 1;
		}
		
		int x = 1;
	}

	static int sum(int[] numbers) {
		int value = 0;

		for (int n : numbers) {
			value += n;
		}

		return value;
	}

	static double sum(double[] numbers) {
		double value = 0;

		for (double n : numbers) {
			value += n;
		}

		return value;
	}

	public static int sumRecursion(int k) {
		if (k > 0) {
			return k + sumRecursion(k - 1);
		} else {
			return 0;
		}
	}
}
