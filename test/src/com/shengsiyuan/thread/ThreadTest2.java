package com.shengsiyuan.thread;

public class ThreadTest2
{
	public static void main(String[] args)
	{
//		Thread t1 = new Thread(new Runnable()
//		{
//			@Override
//			public void run()
//			{
//				for(int i = 0; i < 100; i++)
//				{
//					System.out.println("hello :" + i);
//				}
//			}
//		});
//		
//		t1.start();
		
		Thread t1 = new Thread(new MyThread());
		
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		
		t2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class MyThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println("hello :" + i);
		}
	}
}

class MyThread2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println("welcome: " + i);
		}
		
	}
}










