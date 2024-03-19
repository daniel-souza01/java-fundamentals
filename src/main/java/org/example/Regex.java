package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("test test test java test");
		boolean matchFound = matcher.find();

		System.out.println(matchFound);
	}
}
