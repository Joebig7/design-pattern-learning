package com.mamba.creational.strategy;

/**
 * @author joe.zhang
 * @date 2020-10-29 18:18:41
 * Description:
 */
public class MsgService {
    public void sendMsg(String msgType){
        MsgSend msgSend = MsgFactory.factory(MsgType.getMsgTypeByType(msgType));
        msgSend.send();
    }

    public static void main(String[] args) {
        MsgService msgService = new MsgService();
        msgService.sendMsg("Ali");
        msgService.sendMsg("Tencent");
    }
}
