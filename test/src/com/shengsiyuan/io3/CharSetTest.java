package com.shengsiyuan.io3;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest
{
	public static void main(String[] args)
	{
		SortedMap<String, Charset> map = Charset.availableCharsets();
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> iter = set.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	}
}
