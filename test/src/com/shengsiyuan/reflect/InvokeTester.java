package com.shengsiyuan.reflect;

import java.lang.reflect.Method;

public class InvokeTester
{
	public int add(int param1, int param2)
	{
		return param1 + param2;
	}

	public String echo(String message)
	{
		return "hello: " + message;
	}

	public static void main(String[] args) throws Exception
	{
		// InvokeTester test = new InvokeTester();
		// System.out.println(test.add(1, 2));
		// System.out.println(test.echo("tom"));

		Class<?> classType = InvokeTester.class;

		Object invokeTester = classType.newInstance();

		// System.out.println(invokeTester instanceof InvokeTester);

		Method addMethod = classType.getMethod("add", new Class[] { int.class,
				int.class });
		
		Object result = addMethod.invoke(invokeTester, new Object[]{1, 2});
		
		System.out.println((Integer)result);
		
		System.out.println("---------------------");
		
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		
		Object result2 = echoMethod.invoke(invokeTester, new Object[]{"tom"});
		
		System.out.println((String)result2);
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
