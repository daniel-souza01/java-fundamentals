package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

// parameter -> expression
//(parameter1, parameter2) -> expression
// (parameter1, parameter2) -> { code block }

interface IntFunction {
	int run(int number);
}

public class LambdaExpressions {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		/*
		 numbers.forEach((n) -> {
			System.out.println(n);
		 });
		*/

		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);

		IntFunction sum = (n) -> n * 100;
		System.out.println(sum.run(2));
	}
}
