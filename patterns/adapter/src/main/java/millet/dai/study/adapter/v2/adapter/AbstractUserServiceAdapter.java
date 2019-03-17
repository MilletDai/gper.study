package millet.dai.study.adapter.v2.adapter;

import millet.dai.study.adapter.UserService;

public abstract class AbstractUserServiceAdapter implements UserServiceAdapter {

    @Override
    public void doLogin(String[] args, Object service) {
        ((UserService)service).login(args[0], args.length > 1 ? args[1] : null);
    }

    @Override
    public void doRegister(String[] args, Object service) {
        ((UserService)service).register(args);
    }
}
