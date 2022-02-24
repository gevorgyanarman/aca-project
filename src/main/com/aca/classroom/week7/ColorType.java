package com.aca.classroom.week7;

public enum ColorType {
    RED("red color", 0xFFFF0000),
    GREEN("green color", 0xFF00FF00),
    BLUE("blue color");

    private String colorStringRepresentation;
    private int intValue;

    ColorType(String colorStringRepresentation, int intValue) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = intValue;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    ColorType(String colorStringRepresentation) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = 0;
        System.out.println("The constructor was invoked " + colorStringRepresentation);
    }

    public String getColorStringRepresentation() {
        return colorStringRepresentation;
    }

    public int getIntValue() {
        return intValue;
    }

    public static String getColor(ColorType colorType) {
        if (colorType == ColorType.GREEN) {
            return "green color";
        }
        if (colorType == ColorType.BLUE) {
            return "blue color";
        }
        if (colorType == ColorType.RED) {
            return "red color";
        }
        return "default value";
    }

    @Override
    public String toString() {
        if (this == ColorType.RED) {
            return "red color";
        }
        if (this == ColorType.BLUE) {
            return "blue color";
        }
        if (this == ColorType.GREEN) {
            return "green color";
        }
        return super.toString();
    }
}
