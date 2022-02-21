package com.aca.classroom.week6.factory;

public class MyBoolean {

    private static Object trueMyBoolean = null;

    private boolean value;

    public MyBoolean(boolean value) {
        this.value = value;
    }

    public static MyBoolean create(boolean value) {
        if (value == true) {
            if (trueMyBoolean == null) {
                trueMyBoolean = new MyBoolean(true);
            }

            return (MyBoolean) trueMyBoolean;
        }
        return new MyBoolean(value);
    }

    public static void main(String[] args) {
        MyBoolean myBoolean1 = new MyBoolean(true);
        MyBoolean myBoolean2 = MyBoolean.create(true);
    }

    public boolean isValue() {
        return value;
    }
}
