package com.aca.classroom.week3.bank;

public class Account {

    double money;

    public static void main(String[] args) {
        Account account = new Account();
        account.money = 150_000;
        account.zeroMoney();

        for (int i = 0; i < 365; i++) {
            account.increase1Percent();
        }
    }

    public void zeroMoney() {
        this.money = 0;
    }

    public void increase1Percent() {
        this.money = this.money * 1.01;
    }
}
