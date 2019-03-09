package millet.dai.study.pattern.simpleFactory.model;

import millet.dai.study.pattern.Human;

public class Woman implements Human {
    public void talk() {
        System.out.println("女人串闲天");
    }

    public void work() {
        System.out.println("女人纺织");
    }

    public void temperament() {
        System.out.println("女人温柔");
    }
}
