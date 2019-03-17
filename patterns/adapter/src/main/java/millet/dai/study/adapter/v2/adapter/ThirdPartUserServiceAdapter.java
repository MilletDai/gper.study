package millet.dai.study.adapter.v2.adapter;

import millet.dai.study.adapter.UserService;
import millet.dai.study.adapter.v2.thirdpart.ThirdPartUserService;

public class ThirdPartUserServiceAdapter extends AbstractUserServiceAdapter {
    @Override
    public boolean support(Object service) {
        return service instanceof UserService && service instanceof ThirdPartUserService;
    }

}
