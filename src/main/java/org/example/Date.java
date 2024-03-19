package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void main(String[] args) {
		System.out.println("now date: " + LocalDate.now());
		System.out.println("now time: " + LocalTime.now());

		System.out.println("now date/time: " + LocalDateTime.now());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("formatted now date/time: " + LocalDateTime.now().format(formatter));
	}
}
