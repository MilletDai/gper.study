package millet.dai.study.patter;

import millet.dai.study.pattern.jdk.Observer;
import millet.dai.study.pattern.jdk.Publisher;

public class JdkObserverTest {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addObserver(new Observer());
        publisher.publish();
    }
}
