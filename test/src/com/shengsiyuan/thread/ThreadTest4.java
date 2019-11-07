package com.shengsiyuan.thread;

public class ThreadTest4
{
	public static void main(String[] args)
	{
		Example example = new Example();
		
		Thread t1 = new TheThread(example);
		
		example = new Example();
		
		Thread t2 = new TheThread2(example);
		
		t1.start();
		t2.start();
	}
}

class Example
{
	public synchronized static void execute()
	{
		for(int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep((long)(Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println("hello: " + i);
		}
	}
	
	public synchronized static void execute2()
	{
		for(int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep((long)(Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println("world: " + i);
		}
	}
}


class TheThread extends Thread
{
	private Example example;
	
	public TheThread(Example example)
	{	
		this.example = example;
	}
	
	@Override
	public void run()
	{
		this.example.execute();
	}
}

class TheThread2 extends Thread
{
	private Example example;
	
	public TheThread2(Example example)
	{	
		this.example = example;
	}
	
	@Override
	public void run()
	{
		this.example.execute2();
	}
}









