package com.packet;

public class overloading {
	private double speed;private void changeInt(int count) {
		// TODO Auto-generated method stub
		
	}
	

	public void accelerate(){
		speed+=10;
	}
	public void Multiple(int x,int y){
		x=4;
		y=2;
	}
	public int Multiple(){
		return 0;
		
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
}
