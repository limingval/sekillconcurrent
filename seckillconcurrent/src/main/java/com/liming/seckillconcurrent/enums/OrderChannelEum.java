package com.liming.seckillconcurrent.enums;

/**
 * @author liming
 * @date 2018/7/3   11:00
 */
public enum OrderChannelEum {
//下单来源渠道
    PC(0, "pc"),
    ANDROID(1,"android"),
    IOS(2,"ios");


    private final int code;
    private final String msg;

    OrderChannelEum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
