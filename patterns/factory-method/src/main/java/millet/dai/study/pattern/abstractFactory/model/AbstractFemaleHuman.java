package millet.dai.study.pattern.abstractFactory.model;

import millet.dai.study.pattern.Human;

public abstract class AbstractFemaleHuman implements Human {
    public AbstractFemaleHuman() {
        System.out.println("女人");
    }
}
