package millet.dai.study.pattern;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.pay(PayMode.ALI_PAY, 111.1D);
        order.pay(PayMode.WECHAT_PAY, 222.1D);
        order.pay(PayMode.APPLE_PAY, 333.1D);
        order.pay(PayMode.UNION_PAY, 444.1D);
    }
}
