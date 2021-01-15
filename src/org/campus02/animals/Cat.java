package org.campus02.animals;

public class Cat extends Animal {

    public Cat(String color, String name, int countEyes) {
        super(color, name, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Die Katze geht auf ihren Pfoten...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Die Katze macht miau-miau...");
    }

    @Override
    public void doSomething() {

    }
}
