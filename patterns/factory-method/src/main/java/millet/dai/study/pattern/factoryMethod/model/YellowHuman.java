package millet.dai.study.pattern.factoryMethod.model;

import millet.dai.study.pattern.Human;

public class YellowHuman implements Human {
    public void talk() {
        System.out.println("黄色人种说汉语");
    }

    public void work() {
        System.out.println("黄色人种干活快");
    }

    public void temperament() {
        System.out.println("黄色人种温和");
    }
}
