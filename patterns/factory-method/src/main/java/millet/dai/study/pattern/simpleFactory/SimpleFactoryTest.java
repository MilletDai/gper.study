package millet.dai.study.pattern.simpleFactory;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.HumanAct;

/**
 * 简单工厂模式<br/>
 * 以if判断区分创建的实体并返回
 * */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Human man = SimpleFactory.humans("man");
        HumanAct.action(man);
        Human woman = SimpleFactory.humans("woman");
        HumanAct.action(woman);
    }
}
