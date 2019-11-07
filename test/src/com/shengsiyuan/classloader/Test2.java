package com.shengsiyuan.classloader;

class FinalTest
{
	public static final int x = 6 / 3;
	
	static
	{
		System.out.println("FinalTest static block");
	}
}

public class Test2
{
	public static void main(String[] args)
	{
		System.out.println(FinalTest.x);
	}
}
