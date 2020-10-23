package com.mamba.creational.observer;

/**
 * @author joe.zhang
 * @date 2020-10-23 11:30:14
 * Description: TODO
 */
public class ActualObserver implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("接收到通知"+msg);
    }
}
