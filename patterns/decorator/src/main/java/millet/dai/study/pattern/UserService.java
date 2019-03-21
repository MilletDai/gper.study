package millet.dai.study.pattern;

import com.sun.istack.internal.NotNull;

public interface UserService {

    void login(String username, String password);

    void register(@NotNull String[] userInfo);

}
