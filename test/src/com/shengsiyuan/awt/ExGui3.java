package com.shengsiyuan.awt;

import java.awt.*;

/**
 * Created by Administrator on 2019/10/9.
 */
public class ExGui3
{
    private Frame frame;
    private Panel panel;
    private Button b1,b2,b3,b4;

    public void go()
    {
        frame = new Frame("Complex Layout");
        b1 = new Button("West");
        b2 = new Button("Hello");
        frame.add(b1, BorderLayout.WEST);
        frame.add(b2, BorderLayout.CENTER);

        panel = new Panel();
        b3 = new Button("world");
        b4 = new Button("welcome");

        panel.add(b3);
        panel.add(b4);

        frame.add(panel, BorderLayout.NORTH);
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ExGui3 gui = new ExGui3();
        gui.go();
    }
}
