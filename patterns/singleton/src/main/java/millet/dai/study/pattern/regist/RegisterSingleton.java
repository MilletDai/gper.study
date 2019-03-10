package millet.dai.study.pattern.regist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式：初始化后缓存，枚举也是注册式的一种
 * <br/>
 * spring中 applicationContext就是这种模式
 */
public class RegisterSingleton {
    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            synchronized (ioc) {
                if (!ioc.containsKey(className)) {
                    try {
                        ioc.put(className, Class.forName(className));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return ioc.get(className);
    }

    public static Object getBean(Class<?> clazz) {
        if (ioc.containsKey(clazz.getName())) {
            synchronized (ioc) {
                if (!ioc.containsKey(clazz.getName())) {
                    try {
                        ioc.put(clazz.getName(), clazz.newInstance());
                    } catch (InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return ioc.get(clazz.getName());
    }
}
