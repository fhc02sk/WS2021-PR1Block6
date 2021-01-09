package org.campus02.hasenstall;

public class Sommerhase extends Hase {

    public Sommerhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " ist ein Sommerhase und frisst Klee, aber keine Geschenke zu verteilen");
    }
}
