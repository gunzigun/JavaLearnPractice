package com.shengsiyuan.jdk5;

public class TestVarargs
{
	private static int sum(String str, int... nums)
	{
		System.out.println(str);

		int sum = 0;

		for (int num : nums)
		{
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args)
	{
		int result = sum("a", new int[] { 1, 2 });

		System.out.println(result);

		result = sum("b", 1, 2, 3, 4);

		System.out.println(result);

	}
}
