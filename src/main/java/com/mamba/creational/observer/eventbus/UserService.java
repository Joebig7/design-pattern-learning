package com.mamba.creational.observer.eventbus;

import com.google.common.collect.Lists;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:08:08
 * Description: TODO
 */
public class UserService {
    public void register(User user) {
        List<Object> observers = getObservers();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        EventBus eventBus = new AsyncEventBus(executorService);
        try {
            observers.forEach(o -> eventBus.register(o));
            System.out.println("register user end");
            eventBus.post(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }


    private List<Object> getObservers() {
        return Lists.newArrayList(new EmailObserver(), new MsgObserver());
    }


}
