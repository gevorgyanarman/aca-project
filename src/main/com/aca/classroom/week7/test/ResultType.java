package com.aca.classroom.week7.test;

public enum ResultType {
    FAIL("execution is failed"),
    PASS("execution is passed");

    //The user registration test execution is failed

    private String message;

    ResultType(String message) {
        this.message = message;
    }

    public String getTestExecutionMessage(String testName) {
        return testName + " " + message;
    }
}
