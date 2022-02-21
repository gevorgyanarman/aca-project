package com.aca.classroom.week5.exam;

public abstract class ExamTest {

    private String username;

    public ExamTest(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public abstract boolean isPassed();
}
