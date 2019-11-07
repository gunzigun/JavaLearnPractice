package com.shengsiyuan.awt;

import com.sun.org.apache.bcel.internal.generic.DADD;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

/**
 * Created by Administrator on 2019/10/9.
 */
public class MyFream2
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("My Frame2");

        Button button  = new Button("Click me");

        button.addActionListener(new MyListener());
        frame.addWindowListener(new MyWindowListener());

        frame.add(button);
        frame.setSize(500,500);
        frame.setVisible(true);


    }
}

class MyListener implements ActionListener
{
    @Override
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent e)
    {
        long milliSeconds = e.getWhen();

        Date date = new Date(milliSeconds);

        System.out.println(date.toLocaleString());
    }
}

class MyWindowListener implements WindowListener
{

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("close window");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}