package millet.dai.study.pattern.simpleFactory;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.simpleFactory.model.Man;
import millet.dai.study.pattern.simpleFactory.model.Woman;

public class SimpleFactory {

    public static Human humans(String kinds) {
        Human human = null;
        if ("man".equals(kinds)) {
            human = new Man();
        } else if ("woman".equals(kinds)) {
            human = new Woman();
        }
        return human;
    }

}
