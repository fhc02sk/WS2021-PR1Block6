package org.campus02.animals;

public abstract class Animal {
    private String color;
    private String name;
    private int countEyes;

    public Animal(String color, String name, int countEyes) {
        this.color = color;
        this.name = name;
        this.countEyes = countEyes;
    }

    public abstract void walk();

    public abstract void makeNoise();

    public abstract void doSomething();
}
