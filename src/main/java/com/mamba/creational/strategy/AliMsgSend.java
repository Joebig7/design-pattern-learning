package com.mamba.creational.strategy;

/**
 * @author joe.zhang
 * @date 2020-10-29 18:16:23
 * Description: TODO
 */
public class AliMsgSend implements MsgSend{
    @Override
    public void send() {
        System.out.println("阿里云信息发送。。。");
    }
}
