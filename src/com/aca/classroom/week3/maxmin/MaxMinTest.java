package com.aca.classroom.week3.maxmin;

import java.util.Scanner;

public class MaxMinTest {

    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        maxMin.max = 5;
        maxMin.min = 1;
        Printers.printMaxMin(maxMin);

        //MaxMin[] maxMins = get3MaxMins();
        //printMaxMins(maxMins);
    }

    public static void printMaxMins(MaxMin[] maxMinArray) {
        for (int i = 0; i < maxMinArray.length; i++) {
            MaxMin maxMin = maxMinArray[i];

            printMaxMin(maxMin);

            printMaxMin(maxMinArray[i]);
        }
    }

    public static void printMaxMin(MaxMin maxMin) {
        System.out.println("The max is :" + maxMin.max +
            ", min is: " + maxMin.min);
    }

    public static MaxMin[] get3MaxMins() {
        MaxMin[] maxMinArray = new MaxMin[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a number");
            long number1 = new Scanner(System.in).nextLong();
            System.out.println("Please enter a number");
            long number2 = new Scanner(System.in).nextLong();

            MaxMin maxMin = createMaxMin(number1, number2);
            maxMinArray[i] = maxMin;
        }
        return maxMinArray;
    }

    public static MaxMin createMaxMin(long i, long j) {
        MaxMin maxMin = new MaxMin();
        if (i > j) {
            maxMin.max = i;
            maxMin.min = j;
        } else {
            maxMin.max = j;
            maxMin.min = i;
        }
        return maxMin;
    }
}
