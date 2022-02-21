package com.aca.classroom.week6.figure;

public class Figure {

    private FigureType type;

    //region rectangle
    private double width;
    private double height;
    //endregion

    //region circle
    private double radius;
    //endregion

    //rectangle constructor
    private Figure(double width, double height) {
        type = FigureType.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    //circle constructor
    private Figure(double radius) {
        type = FigureType.CIRCLE;
        this.radius = radius;
    }

    public static Figure ofRectangle(double width, double height) {
        return new Figure(width, height);
    }

    public static Figure ofCircle(double radius) {
        return new Figure(radius);
    }

    public double area() {
        if (type == FigureType.RECTANGLE) {
            return width * height;
        } else {
            return Math.PI * radius * radius;
        }
    }

    public double perimeter() {
        if (type == FigureType.CIRCLE) {
            return 2 * Math.PI * radius;
        } else {
            return 2 * (width + height);
        }
    }

    public FigureType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        if (type == FigureType.CIRCLE) {
            return "Circle : radius " + radius;
        } else {
            return "Rectangle : width " + width + " height: " + height;
        }
    }
}
