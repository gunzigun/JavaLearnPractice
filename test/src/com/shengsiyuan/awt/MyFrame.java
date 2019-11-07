package com.shengsiyuan.awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame
{
	public MyFrame(String title)
	{
		super(title);
	}
	
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame("First GUI app");
		
		frame.setSize(500, 500);
		frame.setBackground(Color.GREEN);
		
		frame.setVisible(true);
	}
	
}
