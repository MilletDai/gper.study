package millet.dai.study.pattern;

public class UserServiceImpl implements UserService {

    @Override
    public void login(String username, String password) {
        System.out.println("用户：" + username + "使用 " + password + " 登陆");
    }

    @Override
    public void register(String[] userInfo) {
        if(userInfo != null){
            for (String info : userInfo) {
                System.out.print(info + "; ");
            }
            System.out.println();
        }
    }
}
