package com.aca.classroom.week5.exam;

public class FailedExamTest extends ExamTest {

    public FailedExamTest(String username) {
        super(username);
    }

    @Override
    public boolean isPassed() {
        return false;
    }
}
