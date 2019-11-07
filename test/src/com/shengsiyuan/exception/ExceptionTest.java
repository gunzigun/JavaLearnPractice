package com.shengsiyuan.exception;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		int c = 0;
		
		try
		{
			int a = 3;
			int b = 0;
			
			c = a / b;
			
			System.out.println("hello world");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("welcome");
		}
		
		
		System.out.println(c);
	}
}
