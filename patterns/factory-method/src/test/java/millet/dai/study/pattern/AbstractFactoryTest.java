package millet.dai.study.pattern;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.HumanAct;
import millet.dai.study.pattern.abstractFactory.FemaleHumanFactory;
import millet.dai.study.pattern.abstractFactory.HumanFactory;
import millet.dai.study.pattern.abstractFactory.MaleHumanFactory;

/**
 * 抽象工厂方法<<br/>
 * 以产品族为维度创建对应的工厂类<br/>
 * */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleHumanFactory();
        HumanFactory femaleFactory = new FemaleHumanFactory();

        Human bm = maleFactory.blackHuman();
        HumanAct.action(bm);
        Human bf = femaleFactory.blackHuman();
        HumanAct.action(bf);

        Human ym = maleFactory.yellowHuman();
        HumanAct.action(ym);
        Human yf = femaleFactory.yellowHuman();
        HumanAct.action(yf);

        Human wm = maleFactory.whiteHuman();
        HumanAct.action(wm);
        Human wf = femaleFactory.whiteHuman();
        HumanAct.action(wf);
    }
}
