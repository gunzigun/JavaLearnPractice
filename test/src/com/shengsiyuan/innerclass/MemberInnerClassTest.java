package com.shengsiyuan.innerclass;

class MemberInner
{
	private int a = 4;
	
	public class Inner2
	{
		private int a = 5;
		
		public void doSomething()
		{
			System.out.println(MemberInner.this.a);
		}
	}
	
	public void method()
	{
		Inner2 inner = this.new Inner2();
	}
}

public class MemberInnerClassTest
{
	public static void main(String[] args)
	{
		MemberInner.Inner2 inner = (new MemberInner()).new Inner2();
		
		inner.doSomething();		
	}
}
