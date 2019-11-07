package com.shengsiyuan.jdk5;

import java.util.EnumSet;
import java.util.Iterator;

enum FontConstant
{
	Plain, Bold, Italilc, Hello
}

public class EnumSetDemo
{
	public static void main(String[] args)
	{
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain);
		
		showEnumSet(enumSet);
		
		System.out.println("-------");
		
		showEnumSet(EnumSet.complementOf(enumSet));
	}
	
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet)
	{
		for(Iterator<FontConstant> iter = enumSet.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}
