package millet.dai.study.pattern.simpleFactory.model;

import millet.dai.study.pattern.Human;

public class Man implements Human {
    public void talk() {
        System.out.println("男人侃大山");
    }

    public void work() {
        System.out.println("男人耕种");
    }

    public void temperament() {
        System.out.println("男人豪爽");
    }
}
