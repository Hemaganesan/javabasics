package com.training.examples;

import java.util.Scanner;

public class Encoding {
	private static String dividestring(String input) {
		int rem = input.length() % 3;
		int div = input.length() / 3;

		String first = null;
		String second = null;
		String third = null;
		if (rem == 0) {
			String first1 = input.substring(div);
			String middle = input.substring(div);
			String last = input.substring(div);

		}
		if (rem == 1) {
			String first1 = input.substring(div);
			String middle = input.substring(div);
			String last = input.substring(div);

		}
		if (rem == 2) {
			String first1 = input.substring(div);
			String middle = input.substring(div);
			String last = input.substring(div);

		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		System.out.println("Enter first string");
		String input2 = sc.next();
		System.out.println("Enter second string");
		String input3 = sc.next();
		System.out.println("Enter third string");

		String st = dividestring(input1);
		String st1 = dividestring(input2);
		String st2 = dividestring(input3);

	}
}
