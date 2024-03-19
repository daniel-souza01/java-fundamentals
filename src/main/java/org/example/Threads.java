package org.example;

// Extend Syntax
public class Threads extends Thread {
	public static void main(String[] args) {
		Threads thread = new Threads();
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}

/* Implement Syntax
public class Threads implements Runnable {
	public static void main(String[] args) {
		Threads threadsObj = new Threads();
		Thread thread = new Thread(threadsObj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}
*/

