package millet.dai.study.pattern.factoryMethod;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.factoryMethod.model.WhiteHuman;

public class WhiteHumanFactory implements HumanFactory {
    public Human humans() {
        return new WhiteHuman();
    }
}
