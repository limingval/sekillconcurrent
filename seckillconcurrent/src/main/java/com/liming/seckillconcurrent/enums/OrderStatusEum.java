package com.liming.seckillconcurrent.enums;

/**
 * @author liming
 * @date 2018/7/3   11:00
 */
public enum OrderStatusEum {

    UNPAID(0, "未支付"),
    PAID(1,"已支付"),
    DELIVARIED(2,"已发货"),
    RECEIVED(3,"已收货"),
    REFUND(4,"已退款"),
    FINAISHED(5,"已完成");;


    private final int code;
    private final String msg;

    OrderStatusEum(int code, String msg) {
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
