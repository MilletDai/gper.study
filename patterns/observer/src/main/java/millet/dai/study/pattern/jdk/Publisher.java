package millet.dai.study.pattern.jdk;

import java.util.Observable;

public class Publisher extends Observable {
    public void publish(){
        setChanged();
        notifyObservers();
    }
}
