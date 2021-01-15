package org.campus02.animals;

public class Dog extends Animal {

    public Dog(String color, String name, int countEyes) {
        super(color, name, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Der Hund sprintet auf den Pfoten sehr schnell");
    }

    @Override
    public void makeNoise() {
        System.out.println("Der Hund macht wuff-wuff...");
    }

    @Override
    public void doSomething() {

    }
}
