/**
 * 
 */
/**
 * @author Student
 *
 */
package com.training;

public class OverLoading1 {
	public static void main(String[] args) {
		OverLoading1 loaing = new OverLoading1();
		loaing.display();
		loaing.display(29.0);
		loaing.display(36);
	}

	public void display() {
		System.out.println("Without parameter");
	}

	public void display(double i) {
		System.out.println(i);
	}

	public void display(int i) {
		System.out.println(i);
	}
}
