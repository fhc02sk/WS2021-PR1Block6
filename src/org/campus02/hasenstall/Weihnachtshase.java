package org.campus02.hasenstall;

public class Weihnachtshase extends Hase{
    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteilen() {
        System.out.println(name + " ist ein Weihnachtshase und legt die Geschenke unter den Christbaum");
    }
}
