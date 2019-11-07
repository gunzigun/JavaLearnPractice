package com.shengsiyuan.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTest
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("file.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("http://www.google.com");
		bw.write("\n");
		bw.write("http://www.baidu.com");
		
		bw.close();
		
		FileInputStream fis = new FileInputStream("file.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		String str = br.readLine();
		
		while(null != str)
		{
			System.out.println(str);
			
			str = br.readLine();
		}
		
		br.close();
		
		
	}
}
