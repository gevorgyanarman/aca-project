package com.aca.classroom.week6.qa;

public class MinTestExecution extends TestExecution {

    public MinTestExecution() {
        super("Min function test");
    }

    @Override
    public Result execute() {
        if (Math.min(9, 784852) == 9) {
            return Result.PASS;
        }
        return Result.FAIL;
    }
}
