package org.campus02.dogexample;

public class Dog {
    public String name;
    public String eyeColor;
    public int weight;

    public void bark() {
        System.out.println(name + " bellt sehr laut");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
