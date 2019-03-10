package millet.dai.study.pattern.hungry;

/**
 * 饿汉式：类加载时初始化对象
 * <br>
 * 因类加载是线程安全的，所以此方式线程安全，没有同步块，性能好，但不使用也会占用内存
 */
public class HungrySingleton {
    private HungrySingleton() {
        if (HungrySingleton.INSTANCE != null) {
            throw new RuntimeException("被反射侵犯");
        }
    }

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
