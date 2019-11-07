package com.shengsiyuan2;

import java.util.HashMap;

public class MapTest2
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		String str = new String("zhangsan");
		
		map.put("a", str);
		map.put("a", str);
		
		System.out.println(map);
	}
}
