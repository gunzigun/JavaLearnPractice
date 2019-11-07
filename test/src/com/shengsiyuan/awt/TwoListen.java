package com.shengsiyuan.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Administrator on 2019/10/9.
 */
public class TwoListen implements MouseMotionListener,MouseListener
{
    private Frame frame;
    private TextField textField;

    public void go()
    {
        frame = new Frame("Two Listeners Example");
        frame.add(new Label("click"), BorderLayout.NORTH);
        textField = new TextField(30);

        frame.add(textField, BorderLayout.SOUTH);

        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.addMouseListener(new MyMouseListener());

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        TwoListen twoListen = new TwoListen();
        twoListen.go();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        String str = "The mouse has left the Frame";
        this.textField.setText(str);
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        String str = "x: " + e.getX() + ", y: " + e.getY();
        this.textField.setText(str);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class MyMouseListener implements MouseListener
{

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

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