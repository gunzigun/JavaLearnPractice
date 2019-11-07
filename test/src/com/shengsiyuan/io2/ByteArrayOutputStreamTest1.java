package com.shengsiyuan.io2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrayOutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		
		String str = "hello world welcome";
		
		byte[] buffer = str.getBytes();
		
		f.write(buffer);
		
		byte[] result = f.toByteArray();
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.println((char)result[i]);
		}

		OutputStream os = new FileOutputStream("test.txt");
		
		f.writeTo(os);
		
		f.close();
		os.close();
	}
}
