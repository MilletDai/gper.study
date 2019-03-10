package millet.dai.study.pattern;

import millet.dai.study.pattern.lazy.LazySingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LazyInnerClassThread implements Runnable {
    @Override
    public void run() {
        Map<Integer, String> instanceMap = new ConcurrentHashMap<>();
        do {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstanceWithInnerClass();
                instanceMap.put(instance.hashCode(), " <-> " + instance.toString());
            }).start();
        } while (instanceMap.size() <= 1);
        System.out.println("LazyInnerClassThread has problems");
        instanceMap.forEach((k,v)-> System.out.println(v));
    }
}
