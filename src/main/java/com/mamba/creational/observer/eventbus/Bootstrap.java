package com.mamba.creational.observer.eventbus;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:17:13
 * Description: TODO
 */
public class Bootstrap {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.register(new User("joe", "13151576623"));
    }
}
