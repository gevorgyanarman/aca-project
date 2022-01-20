package com.company;

public class ArrayTest {

    public static void main(String[] args) {
        final int size = 1000;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(sum(array));
    }

    //printArray

    //array[0] = $value
    //array[1] = $value
    //
    //array[999] = $value

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
