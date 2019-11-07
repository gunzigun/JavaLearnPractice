package com.shengsiyuan.io2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		OutputStream os = new FileOutputStream("1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bos.write("http://www.google.com".getBytes());
		
		bos.close();
		os.close();
	}
}
