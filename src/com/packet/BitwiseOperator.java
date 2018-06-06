package com.packet;

public class BitwiseOperator {
	public static void main(String[] args)
	{
		int count=10;
		count++;
		count--;
		int negcount=-20;
		boolean isTrue=false;
		System.out.println(!isTrue);
		System.out.println(5<<1);
		System.out.println(5>>1);
		System.out.println(5>>>1);
		System.out.println(count<11);
		System.out.println(count>12);
		System.out.println(count<=10);
		System.out.println(count>=12);
		System.out.println(count==10);
		System.out.println(count!=10);
		System.out.println(3&4);
		System.out.println(5^3);
		System.out.println(6|3);
		System.out.println(isTrue&&count==10);
	}
		public static boolean Confirm()
		{
			System.out.println("Confirm()called");
			return true;
		}

}
