package com.shengsiyuan.io;

import java.io.File;

public class FileTest3
{
	public static void main(String[] args)
	{
		File file = new File("c:/abc/xyz/hello");
		
		System.out.println(file.mkdirs());
		
		System.out.println(file.isFile());
	}
}
