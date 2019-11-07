package com.shengsiyuan.innerclass;

import java.util.Date;

public class AnonymousInnerClassTest
{
	@SuppressWarnings("deprecation")
	public String get(Date date)
	{
		return date.toLocaleString();
	}
	 
	public static void main(String[] args)
	{
		AnonymousInnerClassTest test = new AnonymousInnerClassTest();
		
		//String str = test.get(new Date());;
		
		//System.out.println(str);
		
		String str = test.get(new Date()
		{ 
			public String toLocaleString()
			{
				return "hello world";
			}
		});
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
