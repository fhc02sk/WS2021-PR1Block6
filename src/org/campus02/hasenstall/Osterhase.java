package org.campus02.hasenstall;

public class Osterhase extends Hase {

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(name + " ist ein Osterhase und versteckt die Geschenke im Freien");
    }
}
