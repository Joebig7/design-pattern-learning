package com.mamba.creational.observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:13:26
 * Description: 发送邮箱的观察者
 */
public class EmailObserver {

    @Subscribe
    public void send(String name) {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("welcome " + name);
    }
}
