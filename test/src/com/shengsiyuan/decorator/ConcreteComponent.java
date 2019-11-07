package com.shengsiyuan.decorator;

public class ConcreteComponent implements Component
{
	@Override
	public void doSomething()
	{
		System.out.println("function A");
	}

}
