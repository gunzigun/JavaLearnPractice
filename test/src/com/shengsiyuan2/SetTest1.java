package com.shengsiyuan2;

import java.util.HashSet;

public class SetTest1
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
		System.out.println(set.add("a"));
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set.add("a"));
		
		System.out.println(set);
		
		
		
		
	}
}
