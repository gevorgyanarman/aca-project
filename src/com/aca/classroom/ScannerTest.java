package com.aca.classroom;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int i = scanner.nextInt();
        final int j = scanner.nextInt();

        System.out.println(i + j);
    }

}
