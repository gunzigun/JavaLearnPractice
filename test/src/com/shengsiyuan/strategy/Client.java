package com.shengsiyuan.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setName("Tom");
		p1.setId(1);
		p1.setAge(20);

		Person p2 = new Person();
		p2.setName("Tonny");
		p2.setId(2);
		p2.setAge(50);

		Person p3 = new Person();
		p3.setName("Tom");
		p3.setId(5);
		p3.setAge(30);

		Person p4 = new Person();
		p4.setName("ABC");
		p4.setId(8);
		p4.setAge(10);

		Person p5 = new Person();
		p5.setName("Xyz");
		p5.setId(9);
		p5.setAge(15);

		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		Environment env = new Environment();

		UpNameSort uns = new UpNameSort();

		env.setSortInterface(uns);

		env.sort(list);

		for (int i = 0; i < list.size(); i++)
		{
			Person p = list.get(i);

			System.out.println("id: " + p.getId() + ", name: " + p.getName()
					+ ", age:" + p.getAge());
		}

		System.out.println("--------------");
		
		DownNameSort dns = new DownNameSort();

		env.setSortInterface(dns);
		env.sort(list);

		for (int i = 0; i < list.size(); i++)
		{
			Person p = list.get(i);

			System.out.println("id: " + p.getId() + ", name: " + p.getName()
					+ ", age:" + p.getAge());
		}

	}
}
