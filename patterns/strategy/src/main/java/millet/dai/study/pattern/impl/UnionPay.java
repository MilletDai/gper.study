package millet.dai.study.pattern.impl;

import millet.dai.study.pattern.Payment;

public class UnionPay implements Payment {
    @Override
    public void pay(Double d) {
        System.out.println("使用银联支付了：" + d);
    }
}
