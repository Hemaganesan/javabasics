package com.training.examples;

public class Dog implements Travel, Owner {

	@Override
	public void getspeed() {
		System.out.println("Dog speed");

	}

	@Override
	public void ownerName() {
		System.out.println("Dog owner");

	}

}
