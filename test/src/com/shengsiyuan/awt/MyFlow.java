package com.shengsiyuan.awt;

import java.awt.*;

/**
 * Created by Administrator on 2019/10/9.
 */
public class MyFlow
{
    private Frame frame;
    private Button button1,button2,button3;

    public void go()
    {
        frame = new Frame("Flow Layout");
        frame.setLayout(new FlowLayout()); // 使用FlowLayout替换掉默认的BorderLayout

        button1 = new Button("hello");
        button2 = new Button("world");
        button3 = new Button("welcome");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(100,100);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        MyFlow flow = new MyFlow();
        flow.go();
    }
}
