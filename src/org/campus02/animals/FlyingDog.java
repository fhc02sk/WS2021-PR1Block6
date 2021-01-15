package org.campus02.animals;

public class FlyingDog extends Dog implements Fly{

    public FlyingDog(String color, String name, int countEyes) {
        super(color, name, countEyes);
    }

    public void fly() {
        System.out.println("Dieser Hund kann auch fliegen ...");
    }
}
