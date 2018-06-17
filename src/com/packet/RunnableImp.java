package com.packet;

public class RunnableImp implements Runnable{
	String name;
	
	public RunnableImp(String name)
	{
		this.name=name;
		Thread thread=new Thread(this);
		thread.start();
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
		RunnableImp one=new RunnableImp("one");
		RunnableImp two=new RunnableImp("two");
		System.out.println("Main Done"+Thread.currentThread());
}
	
}
