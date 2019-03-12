package millet.dai.study.pattern;

import millet.dai.study.pattern.dynamic.custom.CustomAgentProxy;

public class CustomProxyTest {
    public static void main(String[] args) {
        CustomAgentProxy proxy = new CustomAgentProxy();
        Human man = proxy.getInstance(new Man());
        man.findHouse();
        Human woman = proxy.getInstance(new Woman());
        woman.findHouse();
    }
}
