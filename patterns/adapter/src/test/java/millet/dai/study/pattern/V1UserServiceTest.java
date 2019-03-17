package millet.dai.study.pattern;

import millet.dai.study.adapter.UserService;
import millet.dai.study.adapter.v1.UserServiceImpl;

public class V1UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.register(new String[]{"张三", "zhangsan", "pass001", "男", "11"});
        userService.login("zhangsan", "pass001");
    }
}
