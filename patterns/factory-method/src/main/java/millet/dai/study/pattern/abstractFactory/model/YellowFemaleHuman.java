package millet.dai.study.pattern.abstractFactory.model;

public class YellowFemaleHuman extends AbstractFemaleHuman {
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
