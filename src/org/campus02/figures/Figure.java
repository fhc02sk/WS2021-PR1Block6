package org.campus02.figures;

public abstract class Figure {
    protected String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "colour='" + colour + '\'' +
                '}';
    }

    public abstract double getArea();
}
