package com.shengsiyuan.io;

import java.io.File;
import java.io.IOException;

public class FileTest5
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\abc\\xyz\\hello\\abc.txt");
		
		//file.createNewFile();
		
		file.delete();
	}
}
