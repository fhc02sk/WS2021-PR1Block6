package org.campus02.dogexample;

public class Beagle extends Dog{
    public String lovedFood;

    public Beagle(String lovedFood) {
        this.lovedFood = lovedFood;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                " ,name='" + name + '\'' +
                " ,weight=" + weight +
                " ,eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
