package com.shengsiyuan.innerclass;

class StaticInner
{ 
	private static int a = 4;

	public static class Inner
	{
		public void test()
		{
			System.out.println(a);
		}
	}
}

public class StaticInnerClassTest
{
	public static void main(String[] args)
	{
		StaticInner.Inner inner = new StaticInner.Inner();
		
		inner.test();
	}
}














