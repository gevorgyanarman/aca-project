package com.aca.classroom.week3.bank;

public class AccountTest {

    public static void main(String[] args) {
        Account[] array = new Account[5];
        array[0] = new Account();

        Account first = new Account();
        first.money = 111;
        array[1] = first;

        Account second = new Account();
        second.money = 222;
        array[2] = second;

        mutate(array);

        int b = 1;
        mutateFirst(array, b);
        System.out.println(b);

        System.out.println(array[1].money);

        mutateArray(array);
    }

    public static void mutate(Account[] array) {
        array[0] = null;
    }

    public static void mutateFirst(Account[] array, int a) {
        a = 789;
        array[1].money = 999;
    }

    public static void mutateArray(Account[] arrayInMethod) {
        arrayInMethod = null;
    }

    public static void mutateSecond(Account[] array) {
        array[2] = new Account();
    }
}
