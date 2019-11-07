package com.shengsiyuan.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ExGui
{
	private Frame frame;
	
	private Button button1;
	
	private Button button2;
	
	public void go()
	{
		frame = new Frame("gui example");
		
		//frame.setLayout(new FlowLayout());
		
		button1 = new Button("Press me");
		button2 = new Button("Don't press me");
		
		frame.add(button1);
		frame.add(button2);
		
		frame.pack();
		frame.setVisible(true);	
	}
	
	public static void main(String[] args)
	{
		ExGui window = new ExGui();
		window.go();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
