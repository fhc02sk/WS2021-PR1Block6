package org.campus02.figures;

public class Circle extends  Figure {

    private int radius;

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
