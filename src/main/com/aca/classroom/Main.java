package com.aca.classroom;

public class Main {

    public static void main(String[] args) {
        int i = 974;
        System.out.println(firstDigit(i) + " " + secondDigit(i) + " " + thirdDigit(i));
    }

    public static int firstDigit(int i) {
        return i / 100;
    }

    public static int secondDigit(int i) {
        return (i - 100 * firstDigit(i)) / 10;
    }

    public static int thirdDigit(int i) {
        return i - 100 * firstDigit(i) - 10 * secondDigit(i);
    }

}
