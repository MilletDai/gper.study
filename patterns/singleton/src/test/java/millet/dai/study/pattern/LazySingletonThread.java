package millet.dai.study.pattern;

import millet.dai.study.pattern.lazy.LazySingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LazySingletonThread implements Runnable {
    @Override
    public void run() {
        Map<Integer, String> instanceMap = new ConcurrentHashMap<>();
        do {
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                instanceMap.put(instance.hashCode(), " <-> " + instance.toString());
            }).start();
        } while (instanceMap.size() <= 1);
        System.out.println("LazySingletonThread has problems");
        instanceMap.forEach((k, v) -> System.out.println(v));
    }
}
