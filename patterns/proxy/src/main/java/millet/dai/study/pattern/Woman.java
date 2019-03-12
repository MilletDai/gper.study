package millet.dai.study.pattern;

import millet.dai.study.pattern.Human;

public class Woman implements Human {
    @Override
    public void findJob() {
        System.out.println("女人也要找工作");
    }

    @Override
    public void findHouse() {
        System.out.println("女人也要找房子");
    }
}
