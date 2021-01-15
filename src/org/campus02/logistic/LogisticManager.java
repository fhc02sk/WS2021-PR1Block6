package org.campus02.logistic;

import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> moveables = new ArrayList<>();

    public void addMoveable(Moveable a){
        this.moveables.add(a);
    }

    public void moveAll(String destination) {
        for (Moveable m: moveables) {
            m.move(destination);
        }
    }
}
