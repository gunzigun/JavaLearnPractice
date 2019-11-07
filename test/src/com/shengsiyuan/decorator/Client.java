package com.shengsiyuan.decorator;

public class Client
{
	public static void main(String[] args)
	{
		/*
		 * //节点流 Component component = new ConcreteComponent();
		 * 
		 * //过滤流 Component component2 = new ConcreteDecorator1(component);
		 * 
		 * component2.doSomething();
		 * 
		 * System.out.println("------------");
		 * 
		 * //过滤流 Component component3 = new ConcreteDecorator2(component2);
		 * 
		 * component3.doSomething();
		 */

		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));

		component.doSomething();
	}
}
