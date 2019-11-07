package com.shengsiyuan.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2019/10/9.
 */
public class MenuTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Menu");

        JMenuBar mb = new JMenuBar();

        JMenu m1 = new JMenu(" File");
        JMenu m2 = new JMenu(" Save");
        JMenu m3 = new JMenu(" Load");
        JMenu m4 = new JMenu(" Quite");

        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("hello");
        JMenuItem item3 = new JMenuItem("world");
        JMenuItem item4 = new JMenuItem("zhangsan");

        frame.setJMenuBar(mb);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        m1.add(item1);
        m1.add(item2);
        m1.add(item3);
        m1.add(item4);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(new Dimension(200,300));

        frame.setVisible(true);
    }
}
