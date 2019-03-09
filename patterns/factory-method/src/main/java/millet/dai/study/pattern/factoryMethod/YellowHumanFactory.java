package millet.dai.study.pattern.factoryMethod;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.factoryMethod.model.YellowHuman;

public class YellowHumanFactory implements HumanFactory {
    public Human humans() {
        return new YellowHuman();
    }
}
