package com.aca.classroom.week5.exam;

public class PassedExamTest extends ExamTest {

    public PassedExamTest(String username) {
        super(username);
    }

    @Override
    public boolean isPassed() {
        return true;
    }
}
