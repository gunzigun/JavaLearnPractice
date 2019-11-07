package com.shengsiyuan.clone;

public class CloneTest1
{
	public static void main(String[] args) throws Throwable
	{
		Student student = new Student();

		String a = "zhangsan";

		student.setAge(20);
		student.setName("zhangsan");
		
		Student student2 = (Student)student.clone();
		
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
		
		System.out.println("----------------------");
		
		student2.setName("lisi");

		System.out.println(student.getName());
		System.out.println(student2.getName());
	}
}

class Student implements Cloneable
{
	private int age;
	
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Object object = super.clone();
		
		return object;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
