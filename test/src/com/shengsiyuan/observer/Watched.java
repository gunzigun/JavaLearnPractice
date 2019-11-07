package com.shengsiyuan.observer;

/**
 * Created by Administrator on 2019/10/9.
 */
public interface Watched
{
    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}
