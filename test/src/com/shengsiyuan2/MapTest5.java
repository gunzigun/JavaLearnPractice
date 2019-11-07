package com.shengsiyuan2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest5
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		
		Set set = map.entrySet();
		
		for(Iterator iter = set.iterator(); iter.hasNext();)
		{
			Map.Entry entry = (Map.Entry)iter.next();
			
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
