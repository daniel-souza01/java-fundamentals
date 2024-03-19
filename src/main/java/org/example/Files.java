package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
	static String fileName = "tmp.txt";

	public static void main(String[] args) {
		createFile();
		writeFile();
		readFile();
		deleteFile();
	}

	static void createFile() {
		try {
			File file = new File(fileName);
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	static void writeFile() {
		try {
			FileWriter writer = new FileWriter(fileName);
			for (int x = 0; x < 20; x++) {
				writer.write(x + " - Write file with Java");
				writer.write("\n");
			}
			writer.close();
			System.out.println("Write file success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void readFile() {
		try {
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void deleteFile() {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("Deleted the file: " + file.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}
