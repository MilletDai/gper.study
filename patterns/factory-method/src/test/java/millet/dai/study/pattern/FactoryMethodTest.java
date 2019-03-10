package millet.dai.study.pattern;

import millet.dai.study.pattern.factoryMethod.BlackHumanFactory;
import millet.dai.study.pattern.factoryMethod.HumanFactory;
import millet.dai.study.pattern.factoryMethod.WhiteHumanFactory;
import millet.dai.study.pattern.factoryMethod.YellowHumanFactory;

/**
 * 工厂方法模式<br/>
 * 以实体类型为维度创建相应工厂类
 * */
public class FactoryMethodTest {
    public static void main(String[] args) {
        HumanFactory blackFactory = new BlackHumanFactory();
        Human black = blackFactory.humans();
        HumanAct.action(black);
        HumanFactory yellowFactory = new YellowHumanFactory();
        Human yellow = yellowFactory.humans();
        HumanAct.action(yellow);
        HumanFactory whiteFactory = new WhiteHumanFactory();
        Human white = whiteFactory.humans();
        HumanAct.action(white);
    }
}
