package com.aca.classroom.week5.exam.constr;

public class ExamTest {

    private String username;
    private boolean passed;

    public ExamTest(String username, boolean passed) {
        this.username = username;
        this.passed = passed;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPassed() {
        return passed;
    }
}
