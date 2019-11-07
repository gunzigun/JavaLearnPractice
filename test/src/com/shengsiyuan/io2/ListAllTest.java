package com.shengsiyuan.io2;

import java.io.File;
import java.util.ArrayList;

public class ListAllTest
{
	//用于判断目录或文件所处的层次
	private static int time;
	
	// 递归的方法
	public static void deepList(File file)
	{
		if (file.isFile() || 0 == file.listFiles().length)
		{
			return;
		}
		else
		{
			File[] files = file.listFiles();
			
			files = sort(files);
			
			for(File f : files)
			{
				StringBuffer output = new StringBuffer();
				
				if(f.isFile())
				{
					output.append(getTabs(time));
					output.append(f.getName());
				}
				else
				{
					output.append(getTabs(time));
					output.append(f.getName());
					output.append("\\");
				}
				
				System.out.println(output);
				
				if(f.isDirectory())
				{
					time++;
					
					deepList(f);
					
					time--;
				}
			}
		}
	}

	// 整理文件数组，使得目录排在文件之前
	private static File[] sort(File[] files)
	{
		ArrayList<File> sorted = new ArrayList<File>();

		// 寻找到所有的目录
		for (File f : files)
		{
			if (f.isDirectory())
			{
				sorted.add(f);
			}
		}
		// 寻找到所有的文件
		for (File f : files)
		{
			if (f.isFile())
			{
				sorted.add(f);
			}
		}

		return sorted.toArray(new File[files.length]);
	}
	
	//判断需要加多少 tab的方法
	private static String getTabs(int time)
	{
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < time; i++)
		{
			buffer.append("\t");
		}
		
		return buffer.toString();
	}
	
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Projects\\wsclient");
		
		deepList(file);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
