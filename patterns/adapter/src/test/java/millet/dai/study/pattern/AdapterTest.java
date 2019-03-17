package millet.dai.study.pattern;

import millet.dai.study.adapter.UserService;
import millet.dai.study.adapter.v1.UserServiceImpl;
import millet.dai.study.adapter.v2.adapter.ThirdPartUserServiceAdapter;
import millet.dai.study.adapter.v2.adapter.UserServiceAdapter;
import millet.dai.study.adapter.v2.adapter.V1UserServiceAdapter;
import millet.dai.study.adapter.v2.thirdpart.QQ;
import millet.dai.study.adapter.v2.thirdpart.Wechat;
import millet.dai.study.adapter.v2.thirdpart.WeiBo;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {
    private static List<UserServiceAdapter> adapters = new ArrayList<>();
    static {
        adapters.add(new ThirdPartUserServiceAdapter());
        adapters.add(new V1UserServiceAdapter());
    }
    public static void main(String[] args) {
        testAdapter(getQQInfo(), new QQ());
        System.out.println("======================================================");
        testAdapter(getWeChatInfo(), new Wechat());
        System.out.println("======================================================");
        testAdapter(getWeiBoInfo(), new WeiBo());
        System.out.println("======================================================");
        testAdapter(getUserInfo(), new UserServiceImpl());
    }

    private static String[] getWeChatInfo() {
        return new String[]{"WeChatWeChatWeChatWeChatWeChatWeChat"};
    }

    private static String[] getWeiBoInfo() {
        return new String[]{"WeiBoWeiBoWeiBoWeiBoWeiBoWeiBo"};
    }

    private static String[] getUserInfo() {
        return new String[]{"张三", "zhangsan", "pass001", "男", "11"};
    }

    private static void testAdapter(String[] args, UserService service) {
        UserServiceAdapter adapter = getAdapter(service);
        adapter.doRegister(args, service);
        adapter.doLogin(args, service);
    }

    private static String[] getQQInfo() {
        return new String[]{"QQQQQQQQQQQQQQQQQQ"};
    }

    private static UserServiceAdapter getAdapter(UserService service) {
        for (UserServiceAdapter adapter : adapters) {
            if(adapter.support(service)){
                return adapter;
            }
        }
        return null;
    }

}
