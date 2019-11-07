package com.shengsiyuan.exception;

public class ExceptionTest4
{
	public void method(String str) throws Exception
	{
		if(null == str)
		{
			throw new MyException("传入的字符串参数不能为null");
		}
		else if("hello".equals(str))
		{
			throw new MyException2("传入的字符串不能为hello");
		}
		else
		{
			System.out.println(str);
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			ExceptionTest4 test = new ExceptionTest4();
			
			test.method("hello");
		}
		catch(MyException e)
		{
			System.out.println("进入到MyException catch块");
			e.printStackTrace();
		}
		catch(MyException2 e)
		{
			System.out.println("进入到MyException2 catch块");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("进入到Exception catch块");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("异常处理完毕");
		}
		
		System.out.println("程序执行完毕");
		
	}
}











