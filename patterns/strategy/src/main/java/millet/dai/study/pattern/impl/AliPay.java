package millet.dai.study.pattern.impl;

import millet.dai.study.pattern.Payment;

public class AliPay implements Payment {
    @Override
    public void pay(Double d) {
        System.out.println("使用支付宝支付了：" + d);
    }
}
