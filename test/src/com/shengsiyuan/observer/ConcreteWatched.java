package com.shengsiyuan.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/10/9.
 */
public class ConcreteWatched implements Watched
{
    private List<Watcher> list = new ArrayList<Watcher>();

    @Override
    public void addWatcher(Watcher watcher)
    {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher)
    {
        list.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str)
    {
        for(Watcher watcher : list)
        {
            watcher.update(str);
        }
    }
}
