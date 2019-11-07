package com.shengsiyuan.reflect;

import java.lang.reflect.Array;

public class ArrayTester2
{
	public static void main(String[] args)
	{
		int[] dims = new int[] { 5, 10, 15 };

		Object array = Array.newInstance(Integer.TYPE, dims);
		
		System.out.println(array instanceof int[][][]);

		Object arrayObj = Array.get(array, 3);

		arrayObj = Array.get(arrayObj, 5);

		Array.setInt(arrayObj, 10, 37);

		int[][][] arrayCast = (int[][][]) array;

		System.out.println(arrayCast[3][5][10]);

		// System.out.println(Integer.TYPE);
		// System.out.println(Integer.class);

	}
}
