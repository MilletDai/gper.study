package millet.dai.study.pattern;

import millet.dai.study.pattern.hungry.HungrySingleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HungrySingletonTest {
    public static void main(String[] args) {
        Map<Integer, String> instanceMap = new ConcurrentHashMap<>();
        do {
            new Thread(() -> {
                HungrySingleton instance = HungrySingleton.getInstance();
                instanceMap.put(instance.hashCode(), " <-> " + instance.toString());
            }).start();
        } while (instanceMap.size() <= 1);
        instanceMap.forEach((k,v)-> System.out.println(v));
    }
}
