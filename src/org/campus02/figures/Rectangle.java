package org.campus02.figures;

public class Rectangle extends Figure implements Drawable {

    private int length;
    private int width;

    public Rectangle(String colour, int length, int width) {
        super(colour);

        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Hier wird ein Rechteck gezeichnet: " + this.colour);
    }
}
