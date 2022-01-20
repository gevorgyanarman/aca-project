package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class WhileTest {

    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis();
        final TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println((System.currentTimeMillis()-startMillis)/1000);
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 1000);
    }


}
