package org.campus02.animals;

public class DemoApp {

    public static void main(String[] args) {

        Cat schnurli = new Cat("braun", "schnurli", 2);
        schnurli.walk();

        Dog wuffi = new Dog("schwarz", "wuffi", 2);
        wuffi.walk();

        Animal tier = new Cat("weiß", "schnuffi", 2);
        tier.walk();

        Fly f = new FlyingDog("grau", "fliegender hund", 2);
        f.fly();
        FlyingDog fd = (FlyingDog) f;
        fd.makeNoise();

    }
}
