package com.aca.classroom.week6;

import java.util.Scanner;

public class RandomPutterTest {
    public static void main(String[] args) {
        new RandomPutter(getBuffer()).start();
    }

    public static Buffer getBuffer() {
        int i = new Scanner(System.in).nextInt();
        return i == 0 ? new MyBuffer() : new ArrayBuffer();
    }
}
