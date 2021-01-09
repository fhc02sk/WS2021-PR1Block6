package org.campus02.hasenstall;

public class HasenstallDemoApp {
    public static void main(String[] args) {

        Hase fritzi = new Hase("Fritzi");
        Weihnachtshase santa = new Weihnachtshase("Santa");
        Osterhase struppi = new Osterhase("Struppi");

        fritzi.schlafen();
        santa.schlafen();
        struppi.schlafen();

        fritzi.verteilen();
        santa.verteilen();
        struppi.verteilen();

        // Weihnachtshase is a Hase
        Hase hase = new Weihnachtshase("Santa2");
        hase.verteilen();

    }
}
