package com.mamba.creational.observer.eventbus;

import com.google.common.collect.Lists;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:08:08
 * Description: TODO
 */
public class UserService {


    public void register(User user) {
        EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(10));

       for(Object observer: getObservers()){
           eventBus.register(observer);
       }

        System.out.println("register user end");

       eventBus.post(user.getName());

    }


    private List<Object> getObservers() {
        return Lists.newArrayList(new EmailObserver(), new MsgObserver());
    }


}
