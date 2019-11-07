package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSetDemo3
{
	public static void main(String[] args)
	{
		List<FontConstant> list = new ArrayList<FontConstant>();
		
		list.add(FontConstant.Bold);
		list.add(FontConstant.Italilc);
		list.add(FontConstant.Plain);
		
		showEnumSet(EnumSet.copyOf(list));
	}
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet)
	{
		for(Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}
