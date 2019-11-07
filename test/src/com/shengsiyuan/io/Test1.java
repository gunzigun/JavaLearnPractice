package com.shengsiyuan.io;

public class Test1
{
	//循环方式计算阶乘，又叫做迭代方式
	public int compute(int number)
	{
		int result = 1;
		
		for(int i = number; i > 0; i--)
		{
			result *= i;
		}
		
		return result;
	}
	
	//使用递归方式计算阶乘
	public int compute2(int number)
	{
		if(1 == number)
		{
			return 1;
		}
		else
		{
			return number * compute2(number - 1);
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		Test1 test = new Test1();
		
		System.out.println(test.compute(5));
		
		System.out.println(test.compute2(5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
