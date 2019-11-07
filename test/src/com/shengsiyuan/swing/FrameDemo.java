package com.shengsiyuan.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Administrator on 2019/10/9.
 */
public class FrameDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("FrameDemo");
        JLabel label = new JLabel("hello world");

        frame.addWindowListener(new MyHandler());

        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();

        frame.setVisible(true);
    }
}

class MyHandler extends WindowAdapter
{
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}