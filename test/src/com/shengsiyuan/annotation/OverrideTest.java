package com.shengsiyuan.annotation;

public class OverrideTest
{
	@Override
	public String toString()
	{
		return "This is OverrideTest";
	}
	
	public static void main(String[] args)
	{
		OverrideTest test = new OverrideTest();
		
		System.out.println(test);
	}
}	
