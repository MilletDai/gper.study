package millet.dai.study.adapter.v2.thirdpart;

import millet.dai.study.adapter.UserService;

public class QQ implements ThirdPartUserService, UserService {
    @Override
    public void login(String username, String password) {
        System.out.println("QQ用户名：" + username + " 不需要密码");
    }

    @Override
    public void register(String[] userInfo) {
        System.out.println("QQ openid:" + userInfo[0]);
    }
}
