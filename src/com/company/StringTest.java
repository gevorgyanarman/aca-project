package com.company;

public class StringTest {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(minAndMax(i, j));
    }

    public static String minAndMax(int i, int j) {
        return i < j ? i + "|" + j : j + "|" + i;
    }
}
