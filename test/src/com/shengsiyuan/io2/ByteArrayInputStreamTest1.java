package com.shengsiyuan.io2;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest1
{
	public static void main(String[] args)
	{
		String temp = "abc";
		
		byte[] b = temp.getBytes();
		
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		
		for(int i = 0; i < 2; i++)
		{
			int c;
			
			while(-1 != (c = in.read()))
			{
				if(0 == i)
				{
					System.out.println((char)c);
				}
				else
				{
					System.out.println(Character.toUpperCase((char)c));
				}
			}
					
			System.out.println();
			
			in.reset();
			
			
			
			
			
			
			
			
		}
		
	}
}
