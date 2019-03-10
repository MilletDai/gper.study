package millet.dai.study.pattern;

class HumanAct {

    static void action(Human human) {
        human.talk();
        human.work();
        human.temperament();
        System.out.println("-------------------分割线-------------------");
    }
}
