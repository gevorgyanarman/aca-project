package com.aca.classroom.week6.qa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.setErr(new PrintStream(new FileOutputStream("./errors.txt")));
        System.setOut(new PrintStream(new FileOutputStream("./out.txt")));

        startAll(new TestExecution[]{new MaxTestExecution(), new MinTestExecution()});
    }

    public static void startAll(TestExecution[] executions) {
        for (TestExecution execution : executions) {
            execution.start();
        }
    }
}
