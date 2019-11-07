package com.shengsiyuan.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame");
		
		JButton button = new JButton("click me");
		
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("welcome");
			}
		});
		
		frame.setSize(200, 200);
		
		frame.getContentPane().add(button);
		
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		
		
		frame.setVisible(true);
		
	}
}






















