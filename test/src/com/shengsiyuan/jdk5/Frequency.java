package com.shengsiyuan.jdk5;

import java.util.HashMap;
import java.util.Map;

public class Frequency
{
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word : args)
		{
			map.put(word, (null == map.get(word)) ? 1 : map.get(word) + 1);
		}
		
		System.out.println(map);
	}
}
