package com.shengsiyuan.jdk5;

public class SimpleCollection<T>
{
	private T[] objArr;
	
	private int index = 0;
	
	public SimpleCollection()
	{
		objArr = (T[])new Object[10];  
	}
	
	public SimpleCollection(int capacity)
	{
		objArr = (T[])new Object[capacity];
	}
	
	public void add(T t)
	{
		objArr[index++] = t;
	}
	
	public int getLength()
	{
		return this.index;
	}
	
	public T get(int i)
	{
		return objArr[i];
	}
	
	public static void main(String[] args)
	{
		SimpleCollection<Integer> c = new SimpleCollection<Integer>();
		
		for(int i = 0; i < 10; i++)
		{
			c.add(new Integer(i));
		}
		
		for(int i = 0; i < 10; i++)
		{
			Integer in = c.get(i);
			
			System.out.println(in);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
