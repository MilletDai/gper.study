package millet.dai.study.pattern;

public class UserServiceDecorator implements ThirdPartUserService {

    private UserService service;

    public UserServiceDecorator(UserService service) {
        this.service = service;
    }

    @Override
    public void loginForQQ(String openId) {
        service.login(openId, "QQ");
    }

    @Override
    public void loginForWechat(String openId) {
        service.login(openId, "Wechat");
    }

    @Override
    public void loginForWeiBo(String openId) {
        service.login(openId, "WeiBo");
    }

    @Override
    public void login(String username, String password) {
        service.login(username, password);
    }

    @Override
    public void register(String[] userInfo) {
        service.register(userInfo);
    }
}
