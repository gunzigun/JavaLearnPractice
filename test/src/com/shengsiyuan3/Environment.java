package com.shengsiyuan3;

public class Environment
{
	private Strategy strategy;
	
	public Environment(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public Strategy getStrategy()
	{
		return strategy;
	}

	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public int calculate(int a ,int b)
	{
		return strategy.calculate(a , b);
	}
}
