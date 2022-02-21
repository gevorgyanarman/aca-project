package com.aca.classroom.week6;

public class ArrayBuffer implements Buffer {

    private String[] array = new String[1];

    public static void main(String[] args) {
        Buffer buffer1 = new ArrayBuffer();
        buffer1.put("text 1");

        ArrayBuffer buffer2 = new ArrayBuffer();
        buffer1.put("text 2222");

        System.out.println(buffer1.get());
    }

    @Override
    public void put(final String value) {
        System.out.println("ArrayBuffer put " + value);
        array[0] = value;
    }

    @Override
    public String get() {
        System.out.println("ArrayBuffer get ");
        return array[0];
    }
}
