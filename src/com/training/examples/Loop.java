package com.training.examples;

public class Loop {
	public static void main(String[] args) {

		int i;
		for (i = 100; i >= 0; i--) {
			if (i == 0) {
				System.out.println(i);
			} else if (i >= 0) {
				System.out.println(i);
				i = i - 2;

			}

		}
	}
}