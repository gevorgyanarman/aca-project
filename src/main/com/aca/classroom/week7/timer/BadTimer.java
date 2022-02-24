package com.aca.classroom.week7.timer;

public class BadTimer implements Timer {

    @Override
    public void start() {
        while (true) {
            wait1Sec();
            System.out.println("Hello!");
        }
    }

    private void wait1Sec() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1000) ;
    }
}
