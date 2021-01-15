package org.campus02.logistic;

public class DemoLogisticApp {

    public static void main(String[] args) {

        Car vwGolf = new Car("VW Golf", "blue", 1780);
        Shirt shirt = new Shirt("Tommy", "white", "XL");

        System.out.println("shirt = " + shirt);
        System.out.println("vwGolf = " + vwGolf);

        LogisticManager lm = new LogisticManager();
        lm.addMoveable(vwGolf);
        lm.addMoveable(shirt);

        lm.moveAll("Graz");
    }
}
