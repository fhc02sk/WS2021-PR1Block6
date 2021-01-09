package org.campus02.dogexample;

public class DemoDogApp {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.weight = 1700;
        d.name = "schnuffi";
        d.eyeColor = "braun";

        System.out.println("d.toString() = " + d.toString());
        
        Beagle beagle = new Beagle("Bohnen");
        beagle.name = "bello";
        beagle.eyeColor = "blau";
        beagle.weight = 5500;
        System.out.println("beagle.toString() = " + beagle.toString());
        beagle.bark();

    }
}
