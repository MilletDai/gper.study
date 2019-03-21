package millet.dai.study.pattern;

import com.sun.istack.internal.NotNull;

public interface ThirdPartUserService extends UserService {
    public void loginForQQ(String openId);

    public void loginForWechat(String openId);

    public void loginForWeiBo(String openId);
}
