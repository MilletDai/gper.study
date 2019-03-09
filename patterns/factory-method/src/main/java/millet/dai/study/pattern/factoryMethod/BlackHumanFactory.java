package millet.dai.study.pattern.factoryMethod;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.factoryMethod.model.BlackHuman;

public class BlackHumanFactory implements HumanFactory {
    public Human humans() {
        return new BlackHuman();
    }
}
