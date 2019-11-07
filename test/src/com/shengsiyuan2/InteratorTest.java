package com.shengsiyuan2;

import java.util.HashSet;
import java.util.Iterator;

public class InteratorTest
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		
//		Iterator iter = set.iterator();
//		
//		while(iter.hasNext())
//		{
//			String value = (String)iter.next();
//			System.out.println(value);
//		}
		
		
		for(Iterator iter = set.iterator(); iter.hasNext(); )
		{
			String value = (String)iter.next();
			
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
