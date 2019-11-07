package com.shengsiyuan.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2019/10/9.
 */
public class TestButton
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("Test Button");
        Button button = new Button("Press Me!");

        //增加事件处理器
        button.addActionListener(new ButtonHandle());

        frame.add(button, BorderLayout.CENTER);
        frame.pack();

        frame.setVisible(true);
    }
}


class ButtonHandle implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String lable = e.getActionCommand();
        System.out.println(lable);
        //System.out.println("Button is pressed!");
    }
}