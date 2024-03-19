package org.example;

import java.util.*;

public class Lists {
	public static void main(String[] args) {
		// arrayList();
		// linkedList();
		// hashMap();
		// hashSet();
		iterator();
	}

	static void arrayList() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Volvo");

		// String firstCar = cars.get(0);
		// cars.set(0, "Mercedes");
		// cars.remove(1);
		// cars.clear();

		System.out.println(cars);

		ArrayList<String> chars = new ArrayList<String>();
		chars.add("D");
		chars.add("A");
		chars.add("C");
		chars.add("B");
		Collections.sort(chars);
		System.out.println(chars);
	}

	static void linkedList() {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Volvo");
		System.out.println(cars);
	}

	static void hashMap() {
		HashMap<String, Integer> peoples = new HashMap<String, Integer>();
		peoples.put("John", 12);
		peoples.put("Steve", 14);
		peoples.put("Angie", 32);

		// peoples.get("England");
		// peoples.remove("England");
		// peoples.clear();

		System.out.println(peoples);
	}

	static void hashSet() {
		// cada item é único
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(1);

		System.out.println(nums); // Output: [1];
	}

	static void iterator() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Volvo");

		Iterator<String> it = cars.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
