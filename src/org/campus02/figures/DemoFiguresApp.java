package org.campus02.figures;

public class DemoFiguresApp {
    public static void main(String[] args) {

        Figure r = new Rectangle("red", 10, 20);
        System.out.println(r.getArea());

        Rectangle r2 = (Rectangle) r;

        Drawable d = r2;
        d.draw();
        r2.draw();
    }
}
