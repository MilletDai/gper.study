package millet.dai.study.pattern.statics;

import millet.dai.study.pattern.Human;

public class JobHunter implements Human {
    private Human human;

    public JobHunter proxy(Human human) {
        this.human = human;
        return this;
    }

    @Override
    public void findJob() {
        System.out.println("代理对象：" + this.getClass().getName() + " 执行了 findJob()");
        human.findJob();
    }

    @Override
    public void findHouse() {
        System.out.println("代理对象：" + this.getClass().getName() + " 执行了 findHouse()");
        human.findHouse();
    }
}
