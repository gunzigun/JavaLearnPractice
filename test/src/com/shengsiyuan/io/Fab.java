package com.shengsiyuan.io;

public class Fab
{
	//使用递归计算斐波纳契数列
	public int compute(int n)
	{
		//递归的出口
		if(1 == n || 2 == n)
		{
			return 1;
		}
		else
		{
			return compute(n - 1) + compute(n - 2);
		}
	}
	
	public static void main(String[] args)
	{
		Fab fab = new Fab();
		
		System.out.println(fab.compute(9));
	}
}
