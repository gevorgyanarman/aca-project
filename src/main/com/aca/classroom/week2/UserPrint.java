package com.aca.classroom.week2;

import java.util.Scanner;

public class UserPrint {

    public static void main(String[] args) {
        String[] userNames = new String[3];
        String[] userLastNames = new String[3];
        int[] userAges = new int[3];

        inputUsers(userNames, userLastNames, userAges);

        for (int i = 0; i < 3; i++) {
            printUserData(userNames, userLastNames, userAges, i);
            wait1Sec();
        }
    }

    public static void printUserData(String[] userNames,
                                     String[] userLastNames,
                                     int[] userAges,
                                     int i) {
        System.out.println(
            System.currentTimeMillis() + " "
                + userNames[i] + " "
                + userLastNames[i] + " "
                + userAges[i]
        );
    }

    public static void inputUsers(String[] userNames,
                                  String[] userLastNames,
                                  int[] userAges) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the user name");
            userNames[i] = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user last name");
            userLastNames[i] = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user age");
            userAges[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void wait1Sec() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }
}
