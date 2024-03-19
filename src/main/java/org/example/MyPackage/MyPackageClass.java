package org.example.MyPackage;

import java.util.Scanner;
// import java.util.*; (import all package)

/*
 * Compilar arquivo: javac MyPackageClass.java
 * Compilar pacote: javac -d . MyPackageClass.java
 * Executar: java MyPackage.MyPackageClass
 */

public class MyPackageClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");

		String username = scanner.nextLine();
		System.out.println("Username is: " + username);
	}
}
