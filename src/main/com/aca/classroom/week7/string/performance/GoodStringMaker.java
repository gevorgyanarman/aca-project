package com.aca.classroom.week7.string.performance;

//High Performance
public class GoodStringMaker implements StringMaker {

    @Override
    public StringMakerResult make(final int start, final int end) {
        long startMillis = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(i);
        }
        String text = builder.toString();

        return new StringMakerResult(
            text,
            System.currentTimeMillis() - startMillis
        );
    }
}
