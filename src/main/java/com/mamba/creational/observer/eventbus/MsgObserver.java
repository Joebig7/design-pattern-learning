package com.mamba.creational.observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:13:53
 * Description: 发送短信的观察者
 */
public class MsgObserver {

    @Subscribe
    public void send(String name) {
        System.out.println("name: " + name + " successfully registered");
    }

}
