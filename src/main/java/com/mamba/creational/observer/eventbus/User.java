package com.mamba.creational.observer.eventbus;

/**
 * @author joe.zhang
 * @date 2020-10-30 17:08:23
 * Description: TODO
 */
public class User {

    private String name;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
