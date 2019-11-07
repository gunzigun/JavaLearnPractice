package com.shengsiyuan2;

import java.util.HashSet;

public class SetTest3
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();

		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");

		set.add(s1);
		set.add(s2);

		System.out.println(set);

	}
}

class Student
{
	String name;

	public Student(String name)
	{
		this.name = name;
	}

	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
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
		Student other = (Student) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
	}

	// public int hashCode()
	// {
	// return this.name.hashCode();
	// }
	//
	// public boolean equals(Object obj)
	// {
	// if(this == obj)
	// {
	// return true;
	// }
	//
	// if(null != obj && obj instanceof Student)
	// {
	// Student s = (Student)obj;
	//
	// if(name.equals(s.name))
	// {
	// return true;
	// }
	// }
	//
	// return false;
	// }

}