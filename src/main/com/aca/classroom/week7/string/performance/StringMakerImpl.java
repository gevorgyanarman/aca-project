package com.aca.classroom.week7.string.performance;

//Low Performance
public class StringMakerImpl implements StringMaker, LowPerformance {

    @Override
    public StringMakerResult make(int start, int end) {
        String text = "";

        long startMillis = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            text += i;
        }

        return new StringMakerResult(
            text,
            System.currentTimeMillis() - startMillis
        );
    }
}
