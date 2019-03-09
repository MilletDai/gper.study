package millet.dai.study.pattern.abstractFactory.model;

import millet.dai.study.pattern.Human;

public abstract class AbstractMaleHuman implements Human {
    public AbstractMaleHuman() {
        System.out.println("男人");
    }
}
