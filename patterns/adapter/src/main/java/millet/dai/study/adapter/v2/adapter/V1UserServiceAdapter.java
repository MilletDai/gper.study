package millet.dai.study.adapter.v2.adapter;

import millet.dai.study.adapter.v1.UserServiceImpl;

public class V1UserServiceAdapter extends AbstractUserServiceAdapter {
    @Override
    public boolean support(Object service) {
        return service instanceof UserServiceImpl;
    }
}
