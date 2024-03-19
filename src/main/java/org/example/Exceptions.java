package org.example;

public class Exceptions {
	public static void main(String[] args) {
		try {
			int[] nums = {1, 2, 3};
			nums[10] = 10;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finished.");
		}

		// isPasswordValid("1234567");
	}

	static boolean isPasswordValid(String pass) {
		if (pass.length() < 8) {
			throw new ArithmeticException("Invalid length.");
		}

		return true;
	}
}
