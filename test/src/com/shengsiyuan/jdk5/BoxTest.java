package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.Collection;

public class BoxTest
{
	public static void main(String[] args)
	{
		int a = 3;
		
		Collection<Integer> c = new ArrayList<Integer>();
		
		c.add(3);//将int类型的3转换为Integer类型并放到集合当中
		c.add(a + 3);
		
		for(Integer i : c)
		{
			System.out.println(i);
		}
		
	}
}
