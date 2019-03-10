package millet.dai.study.pattern.lazy;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * 懒汉式：使用的时候初始化对象
 * <br/>
 * 不白占内存空间，存在线程安全问题
 */
public class LazySingleton {
    private LazySingleton() {
    }


    private static LazySingleton INSTANCE_SIMPLE;
    private static LazySingleton INSTANCE_DOUBLE;
    private static LazySingleton INSTANCE_INNER;

    /**
     * 方法级别synchronized，效率低
     *
     * @return Object instance
     */
    public static synchronized LazySingleton getInstance() {
        if (INSTANCE_SIMPLE == null) {
            INSTANCE_SIMPLE = new LazySingleton();
        }
        return INSTANCE_SIMPLE;
    }

    /**
     * 代码块级别synchronized，不见得比上面的好多少
     *
     * @return Object instance
     */
    public static LazySingleton getInstanceDoubleCheck() {
        if (INSTANCE_DOUBLE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE_DOUBLE == null) {
                    INSTANCE_DOUBLE = new LazySingleton();
                }
            }
        }
        return INSTANCE_DOUBLE;
    }

    /**
     * 静态内部类加载的时候初始化（同饿汉式）
     * <br/>
     * 使用时创建，不随便占用内存
     */
    public static LazySingleton getInstanceWithInnerClass() {
        return INSTANCE_INNER = InnerHandler.INNER_INSTANCE;
    }

    private static class InnerHandler {
        private static final LazySingleton INNER_INSTANCE = new LazySingleton();
    }

}
