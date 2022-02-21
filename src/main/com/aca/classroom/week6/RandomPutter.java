package com.aca.classroom.week6;

public class RandomPutter {

    private Buffer buffer;

    public RandomPutter(Buffer buffer) {
        this.buffer = buffer;
    }

    public static void wait1sec() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {
        }
    }

    public void start() {

        for (int i = 0; ; i += 2) {
            buffer.put("text" + i);
            wait1sec();
            System.out.println(buffer.get());
            wait1sec();
        }
    }
}
