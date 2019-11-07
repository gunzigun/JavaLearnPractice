package com.shengsiyuan.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2019/10/9.
 */
public class TopLevelDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TopLevelDemo");
        frame.addWindowListener(new MyHandler());

        JLabel label = new JLabel("hello");
        label.setBackground(Color.YELLOW);
        label.setPreferredSize(new Dimension(200,180));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.CYAN);
        menuBar.setPreferredSize(new Dimension(200,20));

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
