package millet.dai.study.pattern;

public class LazySingletonTest {
    public static void main(String[] args) {
        new Thread(new LazySingletonThread()).start();
        new Thread(new LazyDoubleCheckThread()).start();
        new Thread(new LazyInnerClassThread()).start();
    }
}
