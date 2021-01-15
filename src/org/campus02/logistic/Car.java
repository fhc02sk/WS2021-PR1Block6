package org.campus02.logistic;

public class Car implements Moveable {
    private String type;
    private String color;
    private int weight;

    public Car(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void move(String destination) {
        System.out.println(type + " in der Farbe " + color
                + " mit dem Gewicht " + weight + " wird nach " + destination + " verschoben");
    }
}
