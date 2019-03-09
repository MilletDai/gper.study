package millet.dai.study.pattern.abstractFactory;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.abstractFactory.model.BlackFemaleHuman;
import millet.dai.study.pattern.abstractFactory.model.WhiteFemaleHuman;
import millet.dai.study.pattern.abstractFactory.model.YellowFemaleHuman;

public class FemaleHumanFactory implements HumanFactory {
    public Human blackHuman() {
        return new BlackFemaleHuman();
    }

    public Human whiteHuman() {
        return new WhiteFemaleHuman();
    }

    public Human yellowHuman() {
        return new YellowFemaleHuman();
    }
}
