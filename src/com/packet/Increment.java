package com.packet;

public class Increment {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for (i = 0; i <= 10; i++) {
			for (j = 0; j <= i; j++) {

				System.out.println(j);
			}
			System.out.println();
			i++;
		}
	}

}
