package com.shengsiyuan.io2;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		OutputStream os = new FileOutputStream("c:\\out.txt", true);
		
		String str = "aaaaa";
		
		byte[] buffer = str.getBytes();
		
		os.write(buffer);
		
		os.close();
	}
}
