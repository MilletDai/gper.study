package millet.dai.study.pattern;

public class ThirdPartTest {
    public static void main(String[] args) {
        ThirdPartUserService service = new UserServiceDecorator(new UserServiceImpl());
        service.login("username", "password");
        service.loginForQQ("QQQQQQQQQQQQQQQ-----------");
    }
}
