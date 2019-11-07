package com.shengsiyuan.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Administrator on 2019/10/9.
 */
public class TwoListenAdapter
{
    private Frame frame;
    private TextField textField;

    public void go()
    {
        frame = new Frame("Two Listeners Example");
        frame.add(new Label("click"), BorderLayout.NORTH);
        textField = new TextField(30);

        frame.add(textField, BorderLayout.SOUTH);

        frame.addMouseListener(new MyAdapter());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        TwoListenAdapter twoListen = new TwoListenAdapter();
        twoListen.go();
    }
}

class MyAdapter extends MouseAdapter
{
    @Override
    public void mouseEntered(MouseEvent e)
    {
        String str = "The mouse has entered the Frame";
        System.out.println(str);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        String str = "The mouse has exited the Frame";
        System.out.println(str);
    }
}