package millet.dai.study.pattern.jdk;

import java.util.Observable;

public class Observer implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("监听到" + o.getClass() + arg);
    }
}
