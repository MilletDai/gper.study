package millet.dai.study.pattern;

import millet.dai.study.pattern.dynamic.jdk.JdkAgentProxy;

public class JdkProxyTest {
    public static void main(String[] args) {
        JdkAgentProxy proxy = new JdkAgentProxy();
        Human man = proxy.getInstance(new Man());
        man.findHouse();
        Human woman = proxy.getInstance(new Woman());
        woman.findHouse();
    }
}
