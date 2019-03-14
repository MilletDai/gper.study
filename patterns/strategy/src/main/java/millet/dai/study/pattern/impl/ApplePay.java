package millet.dai.study.pattern.impl;

import millet.dai.study.pattern.Payment;

public class ApplePay implements Payment {
    @Override
    public void pay(Double d) {
        System.out.println("使用ApplePay支付了：" + d);
    }
}
