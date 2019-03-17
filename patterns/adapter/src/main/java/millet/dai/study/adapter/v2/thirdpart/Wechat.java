package millet.dai.study.adapter.v2.thirdpart;

import millet.dai.study.adapter.UserService;

public class Wechat implements ThirdPartUserService, UserService {
    @Override
    public void login(String username, String password) {
        System.out.println("微信用户名：" + username + " 不需要密码");
    }

    @Override
    public void register(String[] userInfo) {
        System.out.println("微信 openid:" + userInfo[0]);
    }
}
