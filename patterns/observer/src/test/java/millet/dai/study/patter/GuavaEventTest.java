package millet.dai.study.patter;

import com.google.common.eventbus.EventBus;
import millet.dai.study.pattern.guava.GuavaEvent;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus bus = new EventBus();
        GuavaEvent event = new GuavaEvent();
        bus.register(event);
        bus.post("test");
    }
}
