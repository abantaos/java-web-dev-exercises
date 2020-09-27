package org.launchcode.java.exercises.shapes;

import org.launchcode.java.exercises.shapes.Measurable;

public class Square implements Measurable {

    //has a's
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
