package com.mamba.creational.template;

/**
 * @author joe.zhang
 * @date 2020-10-26 18:44:33
 * Description: 模板方法模式示例
 */
public abstract class AbstractMethod {

    public final void method1(){
        //....
        method2();
        method3();
    }

    protected abstract void method2();
    protected abstract void method3();
}
