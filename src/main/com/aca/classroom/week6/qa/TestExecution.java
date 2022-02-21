package com.aca.classroom.week6.qa;

public abstract class TestExecution {

    private String description;

    public TestExecution(String description) {
        this.description = description;
    }

    public abstract Result execute();

    public void start() {
        printTestDescription();
        Result result = execute();
        printResult(result);
    }

    public void printTestDescription() {
        System.out.println("Starting the " + description);
    }

    public void printResult(Result result) {
        String message = "The result of " + description + " is " + result;

        if (result == Result.FAIL) {
            System.err.println(message);
        } else {
            System.out.println(message);
        }
    }

}
