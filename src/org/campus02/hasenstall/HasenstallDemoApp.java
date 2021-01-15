package org.campus02.hasenstall;

import java.util.ArrayList;

public class HasenstallDemoApp {
    public static void main(String[] args) {

        Hase fritzi = new Hase("Fritzi");
        Weihnachtshase santa = new Weihnachtshase("Santa", 3);
        Osterhase struppi = new Osterhase("Struppi");

        fritzi.schlafen();
        santa.schlafen();
        struppi.schlafen();

        fritzi.verteilen();
        santa.verteilen();
        struppi.verteilen();

        // Weihnachtshase is a Hase
        Hase hase = new Weihnachtshase("Santa2", 7);
        hase.verteilen();

        santa.setAnzahlGeschenke(9);

        System.out.println("\nHasenstall:\n");
        ArrayList<Hase> hasenstall = new ArrayList<>();
        hasenstall.add(fritzi);
        hasenstall.add(santa);
        hasenstall.add(struppi);
        hasenstall.add(hase);
        hasenstall.add(new Sommerhase("klee-sucher"));
        for(int i = 0; i < hasenstall.size();i++){
            Hase x = hasenstall.get(i);
            x.verteilen();
        }

        Weihnachtshase santa2 = (Weihnachtshase) hase;
        santa2.setAnzahlGeschenke(11);
        hase.verteilen();

        Osterhase o = (Osterhase) hase;
        o.verteilen();
    }
}
