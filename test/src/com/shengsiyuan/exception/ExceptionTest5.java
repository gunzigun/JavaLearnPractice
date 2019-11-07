package com.shengsiyuan.exception;

public class ExceptionTest5
{
	public void method() 
	{
		try
		{
			System.out.println("进入到try块");
			
			System.exit(0);
		}
		catch(Exception ex)
		{
			System.out.println("异常发生了");
		}
		finally
		{
			System.out.println("进入到finally块");
		}
		
		System.out.println("异常处理后续的代码");
	}
	
	public static void main(String[] args)
	{
		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
