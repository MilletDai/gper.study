package millet.dai.study.pattern.abstractFactory.model;

import millet.dai.study.pattern.Human;

public class WhiteMaleHuman extends AbstractMaleHuman{
    public void talk() {
        System.out.println("白色人种说啥的都有");
    }

    public void work() {
        System.out.println("白色人种不怎么干活");
    }

    public void temperament() {
        System.out.println("白色人种情绪外放");
    }
}
