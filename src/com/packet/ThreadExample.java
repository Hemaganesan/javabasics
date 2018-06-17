package com.packet;

import sun.applet.Main;

public class ThreadExample extends Thread {
	String name;
	
public ThreadExample(String name)
{
	this.name=name;
	start();
}
@Override
public void run() {
	int i;
	for(i=0;i<10;i++)
	{
		System.out.println(name+"=" +i+" "+Thread.currentThread());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
	public static void main(String[] args) {
		ThreadExample one=new ThreadExample("one");
		ThreadExample two=new ThreadExample("two");
		try {
			one.join();
			two.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Main Done"+Thread.currentThread());
	}

}
