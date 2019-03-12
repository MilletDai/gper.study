package millet.dai.study.pattern;

import millet.dai.study.pattern.Human;

public class Man implements Human {
    @Override
    public void findJob() {
        System.out.println("男人要找工作");
    }

    @Override
    public void findHouse() {
        System.out.println("男人要找房子");
    }
}
