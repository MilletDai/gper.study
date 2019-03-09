package millet.dai.study.pattern.abstractFactory.model;

public class BlackFemaleHuman extends AbstractFemaleHuman {
    public void talk() {
        System.out.println("黑色人种说英语");
    }

    public void work() {
        System.out.println("黑色人种干活拼命");
    }

    public void temperament() {
        System.out.println("黑色人种热情");
    }
}
