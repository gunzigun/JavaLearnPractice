package com.shengsiyuan3;

import java.util.Vector;

public class VectorTest
{
	public static void main(String[] args)
	{
		Vector vector = new Vector();
		
		vector.add("hello");
		vector.add("world");
		vector.add("hello world");
		
		for(int i = 0; i < vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
	}
}
