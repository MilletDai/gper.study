package millet.dai.study.pattern;

import millet.dai.study.pattern.impl.AliPay;
import millet.dai.study.pattern.impl.ApplePay;
import millet.dai.study.pattern.impl.UnionPay;
import millet.dai.study.pattern.impl.WeChatPay;

public enum PayMode {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay()),
    APPLE_PAY(new ApplePay()),
    UNION_PAY(new UnionPay());
    private Payment payment;
    PayMode(Payment payment){
        this.payment = payment;
    }

    public Payment payment() {
        return payment;
    }
}
