package com.packet;

public class Car {

	double speed;void changeInt(int count) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args)
	{
		double speed;
		Car car1= new Car();
		Car car2= new Car();
		car1.speed=30.0;
		car2.speed=50.0;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		int count=200;
		car1.changeInt(count);
		System.out.println(count);
		
	}


	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
