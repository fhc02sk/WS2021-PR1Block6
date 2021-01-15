package org.campus02.hasenstall;

public class Weihnachtshase extends Hase{

    private int anzahlGeschenke;

    public Weihnachtshase(String name, int anzahlGeschenke) {
        super(name);
        this.anzahlGeschenke = anzahlGeschenke;
    }

    public int getAnzahlGeschenke() {
        return anzahlGeschenke;
    }

    public void setAnzahlGeschenke(int anzahlGeschenke) {
        this.anzahlGeschenke = anzahlGeschenke;
    }

    @Override
    public void verteilen() {
        System.out.println(name + " ist ein Weihnachtshase und legt " + anzahlGeschenke
                + " Geschenke unter den Christbaum");
    }
}
