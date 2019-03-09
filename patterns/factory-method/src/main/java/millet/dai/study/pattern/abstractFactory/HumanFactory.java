package millet.dai.study.pattern.abstractFactory;

import millet.dai.study.pattern.Human;

public interface HumanFactory {

    Human blackHuman();

    Human whiteHuman();

    Human yellowHuman();

}
