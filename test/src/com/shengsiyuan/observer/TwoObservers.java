package com.shengsiyuan.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/10/9.
 */

class BeingWatched extends Observable
{
    void counter(int number)
    {
        for(; number >= 0; --number)
        {
            this.setChanged();
            this.notifyObservers(number);
        }
    }
}

class Watcher1 implements Observer
{
    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("Watcher1's count is: " + arg);
    }
}

class Watcher2 implements Observer
{
    @Override
    public void update(Observable o, Object arg)
    {
        if (((Integer)arg).intValue() <= 5)
        {
            System.out.println("Watcher2's count is: " + arg);
        }

    }
}

public class TwoObservers
{
    public static void main(String[] args)
    {
        BeingWatched watched = new BeingWatched();

        Watcher1 watch1 = new Watcher1();
        Watcher2 watch2 = new Watcher2();

        watched.addObserver(watch1);
        watched.addObserver(watch2);

        watched.counter(10);
    }
}
