package com.mamba.creational.observer;

/**
 * @author joe.zhang
 * @date 2020-10-23 11:30:51
 * Description: 示例类
 */
public class Boss {
    public static void main(String[] args) {
        Observer observer1 = new ActualObserver();
        Observer observer2 = new ActualObserver();

        Subject subject = new SubjectA();
        subject.register(observer1);
        subject.register(observer2);

        subject.notifyMsg("发工资了");
    }
}
