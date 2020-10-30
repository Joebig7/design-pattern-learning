package com.mamba.creational.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joe.zhang
 * @date 2020-10-29 18:19:47
 * Description: 用来生产具体的模板
 */
public class MsgFactory {

    private static final Map<MsgType, MsgSend> map = new HashMap<>();

    static {
        map.put(MsgType.Ali, new AliMsgSend());
        map.put(MsgType.Tencent, new TencentMsgSend());
    }
    public static MsgSend factory(MsgType msgType) {
        return map.get(msgType);
    }
}
