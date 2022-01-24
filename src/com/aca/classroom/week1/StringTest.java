package com.aca.classroom.week1;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        final String string = new Scanner(System.in).nextLine();

        System.out.println(indexOfString(string));
    }

    public static int indexOfString(String string) {
        char chars[] = new char[]{'a', 'b', 'c', 'd', 'e'};
        final char firstChar = string.charAt(0);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == firstChar) {
                return i;
            }
        }
        return -1;
    }
}
