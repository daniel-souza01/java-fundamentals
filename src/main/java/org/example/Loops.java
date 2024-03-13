package org.example;

public class Loops {
	public static void main(String[] args) {
		// while
		System.out.println("while:");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		// do/while
		int a = 6;
		do {
			System.out.println("\ndo while: " + a);
			a++;
		} while (a < 5);

		// for
		System.out.println("\nfor:");
		for (int x = 0; x < 5; x++) {
			System.out.println(x);
		}

		// for Each
		System.out.println("\nfor each:");
		String[] cars = {"BMW", "Ford", "Honda"};
		for (String c : cars) {
			System.out.println(c);
		}

		// break
		System.out.println("\nbreak:");
		for (int z = 0; z < 10; z++) {
			if (z == 4) {
				break;
			}
			System.out.println(z);
		}

		// continue
		System.out.println("\ncontinue:");
		for (int c = 0; c < 5; c++) {
			if (c == 3) {
				continue;
			}
			System.out.println(c);
		}
	}
}
