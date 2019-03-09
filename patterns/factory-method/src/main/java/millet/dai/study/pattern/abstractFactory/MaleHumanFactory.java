package millet.dai.study.pattern.abstractFactory;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.abstractFactory.model.BlackMaleHuman;
import millet.dai.study.pattern.abstractFactory.model.WhiteMaleHuman;
import millet.dai.study.pattern.abstractFactory.model.YellowMaleHuman;

public class MaleHumanFactory implements HumanFactory{

    public Human blackHuman() {
        return new BlackMaleHuman();
    }

    public Human whiteHuman() {
        return new WhiteMaleHuman();
    }

    public Human yellowHuman() {
        return new YellowMaleHuman();
    }
}
