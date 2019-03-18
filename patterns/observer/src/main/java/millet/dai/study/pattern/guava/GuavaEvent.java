package millet.dai.study.pattern.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    void subscribe(String arg){
        System.out.println("执行" + GuavaEvent.class + "#subscribe( "+ arg + ")");
    }
}
