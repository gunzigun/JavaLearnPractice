package com.shengsiyuan.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DownNameSort implements SortInterface, Comparator<Person>
{
	public void sort(List<Person> list)
	{
		Collections.sort(list, this);
	}
	
	public int compare(Person o1, Person o2)
	{
		int result = o2.getName().compareTo(o1.getName());
		
		if(0 == result)
		{
			return o1.getId() - o2.getId();
		}
		
		return result;
	}

}
