package org.campus02.logistic;

public class Shirt implements Moveable {
    private String brand;
    private String color;
    private String size;

    public Shirt(String brand, String color, String size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public void move(String destination) {
        System.out.println("T-Shirt wird nach " + destination + " verschoben");
    }
}
