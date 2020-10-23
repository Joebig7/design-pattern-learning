package com.mamba.creational.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joe.zhang
 * @date 2020-10-23 11:27:50
 * Description: TODO
 */
public class SubjectA implements Subject {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyMsg(String msg) {
        observerList.forEach(observer -> observer.update(msg));
    }
}
