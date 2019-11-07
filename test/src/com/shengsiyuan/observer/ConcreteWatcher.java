package com.shengsiyuan.observer;

/**
 * Created by Administrator on 2019/10/9.
 */
public class ConcreteWatcher implements Watcher
{
    @Override
    public void update(String str)
    {
        System.out.println(str);
    }
}
