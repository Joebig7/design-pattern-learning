package com.mamba.creational.strategy;

/**
 * @author joe.zhang
 * @date 2020-10-29 18:16:49
 * Description: TODO
 */
public class TencentMsgSend implements MsgSend{

    @Override
    public void send() {
        System.out.println("腾讯信息发送。。。");
    }
}
