package org.example.OOP;

public class Car {
	int year;
	String model;
	String color;
	private int price;
	final String size = "Large";

	public Car(int y, String m, String c) {
		year = y;
		model = m;
		color = c;
	}

	// Getter
	public int getPrice() {
		return price;
	}

	// Setter
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	static void staticMethod() {
		System.out.println("This method is static!");
	}

	public void publicMethod() {
		System.out.println("This method is public!");
	}

	public static void main(String[] args) {
		staticMethod();
		new Car(2000, "Honda", "Black").publicMethod();
	}
}

class Mustang extends Car {
	class InnerClass {
		int x = 7777;
	}

	public Mustang(int y, String m, String c) {
		super(y, m, c);
	}


	public void publicMethod() {
		System.out.println("Polymorphism publicMethod!");
	}

	public static void main(String[] args) {
		Mustang.staticMethod();
		Mustang mustang = new Mustang(2000, "", "");
		mustang.publicMethod();

		System.out.println(mustang.new InnerClass().x);
	}
}

