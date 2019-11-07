package com.shengsiyuan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester
{
	// 该方法实现对Customer对象的拷贝操作
	public Object copy(Object object) throws Exception
	{

		Class<?> classType = object.getClass();

		Object objectCopy = classType.getConstructor(new Class[] {})
				.newInstance(new Object[] {});

		// 获得对象的所有成员变量

		Field[] fields = classType.getDeclaredFields();

		for (Field field : fields)
		{
			String name = field.getName();

			String firstLetter = name.substring(0, 1).toUpperCase();// 将属性的首字母转换为大写

			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);

			Method getMethod = classType.getMethod(getMethodName,
					new Class[] {});
			Method setMethod = classType.getMethod(setMethodName,
					new Class[] { field.getType() });

			Object value = getMethod.invoke(object, new Object[] {});

			setMethod.invoke(objectCopy, new Object[] { value });
		}

		// 以上两行代码等价于下面一行
		// Object obj2 = classType.newInstance();

		// System.out.println(obj);

		return objectCopy;
	}

	public static void main(String[] args) throws Exception
	{
		Customer customer = new Customer("Tom", 20);
		customer.setId(1L);

		ReflectTester test = new ReflectTester();

		Customer customer2 = (Customer) test.copy(customer);

		System.out.println(customer2.getId() + "," + customer2.getName() + ","
				+ customer2.getAge());
	}
}

class Customer
{
	private Long id;

	private String name;

	private int age;

	public Customer()
	{

	}

	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
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
}