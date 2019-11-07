package com.shengsiyuan.jdk5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();

		set.add("aa");
		set.add("bb");
		set.add("cc");

		for (Iterator<String> iter = set.iterator(); iter.hasNext();)
		{
			String value = iter.next();
			System.out.println(value);
		}
		
		System.out.println("----------------");
		
		Set<People> set2 = new HashSet<People>();
		
		set2.add(new People("zhangsan", 20, "beijing"));
		set2.add(new People("lisi", 30, "shanghai"));
		set2.add(new People("wangwu", 40, "tianjin"));
		
		for(Iterator<People> iter = set2.iterator(); iter.hasNext();)
		{
			People people = iter.next();
			
			String name = people.getName();
			int age = people.getAge();
			String address = people.getAddress();
			
			System.out.println(name + "," + age + "," + address);
		}
	}
}

class People
{
	private String name;

	private int age;

	private String address;

	public People(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (address == null)
		{
			if (other.address != null)
				return false;
		}
		else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}
}
