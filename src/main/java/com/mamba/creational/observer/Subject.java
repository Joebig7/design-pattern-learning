package com.mamba.creational.observer;

/**
 * @author joe.zhang
 * @date 2020-10-23 11:20:54
 * Description:  主体（被观察的对象）
 */
public interface Subject {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyMsg(String msg);

}
