package com.shengsiyuan.reflect;

import java.lang.reflect.Method;

public class TestPrivate
{
	public static void main(String[] args) throws Exception
	{
		Private p = new Private();

		Class<?> classType = p.getClass();

		Method method = classType.getDeclaredMethod("sayHello",
				new Class [] {String.class});
		
		method.setAccessible(true);//压制Java的访问控制检查
		
		String str = (String)method.invoke(p, new Object[]{"zhangsan"});
		
		System.out.println(str);
	}
}
