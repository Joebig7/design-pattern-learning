package com.mamba.creational.strategy;

public enum MsgType {

    Ali("Ali"),
    Tencent("Tencent");

    private String type;

    MsgType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static MsgType getMsgTypeByType(String type) {
        MsgType[] values = MsgType.values();
        for (MsgType msgType : values) {
            if (type.equals(msgType.getType())) {
                return msgType;
            }
        }
        return null;
    }

}
