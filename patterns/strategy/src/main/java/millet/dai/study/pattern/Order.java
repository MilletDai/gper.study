package millet.dai.study.pattern;

class Order {
    void pay(PayMode payMode, Double d){
        payMode.payment().pay(d);
    }
}
