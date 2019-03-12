package millet.dai.study.pattern;

import millet.dai.study.pattern.dynamic.cglib.CglibAgentProxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        CglibAgentProxy proxy = new CglibAgentProxy();
        Human man = proxy.getInstance(new Man());
        man.findHouse();
        Human woman = proxy.getInstance(new Woman());
        woman.findHouse();
    }
}
