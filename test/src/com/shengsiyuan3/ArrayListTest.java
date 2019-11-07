package com.shengsiyuan3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		
		list.add("string");
		list.add(new Integer(2));
		list.add(new Boolean(false));
		
		String str = (String)list.get(0);
		Integer in = (Integer)list.get(1);
		String b = (String)list.get(2);
		
		
	}
}
