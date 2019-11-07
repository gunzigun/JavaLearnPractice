package com.shengsiyuan.io2;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = new FileInputStream("c:/hello.txt");
		
		byte[] buffer = new byte[200];
		
		int length;
		
		while(-1 != (length = is.read(buffer, 0, 200)))
		{
			String str = new String(buffer,0, length);
			
			System.out.println(str);
		}
			
		is.close();	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
