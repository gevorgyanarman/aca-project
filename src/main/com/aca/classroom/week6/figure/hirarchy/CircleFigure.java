package com.aca.classroom.week6.figure.hirarchy;

public class CircleFigure implements Figure {

    private double radius;

    public CircleFigure(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
