package com.shengsiyuan.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest3
{
	public static void main(String[] args) throws Exception
	{
		Teacher3 t = new Teacher3();
		
		t.setAge(40);
		t.setName("Teacher Zhang");
		
		Student3 s1 = new Student3();
		
		s1.setAge(20);
		s1.setName("zhangsan");
		s1.setTeacher(t);
		
		Student3 s2 = (Student3)s1.deepCopy();
		
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		
		System.out.println("-----------------------");
		
		System.out.println(s2.getTeacher().getAge());
		System.out.println(s2.getTeacher().getName());
		
		s2.getTeacher().setAge(50);
		s2.getTeacher().setName("Teacher Li");
		
		System.out.println(s1.getTeacher().getAge());
		System.out.println(s1.getTeacher().getName());
		
		
		
		
	}
	
	
}



class Teacher3 implements Serializable
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
}

class Student3 implements Serializable
{
	private int age;
	
	private String name;
	
	private Teacher3 teacher;

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

	public Teacher3 getTeacher()
	{
		return teacher;
	}

	public void setTeacher(Teacher3 teacher)
	{
		this.teacher = teacher;
	}
	
	public Object deepCopy() throws Exception
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return ois.readObject();
	}
}