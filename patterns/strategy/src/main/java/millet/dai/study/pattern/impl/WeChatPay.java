package millet.dai.study.pattern.impl;

import millet.dai.study.pattern.Payment;

public class WeChatPay implements Payment {
    @Override
    public void pay(Double d) {
        System.out.println("使用微信支付了：" + d);
    }
}
