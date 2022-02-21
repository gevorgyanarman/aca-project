package com.aca.classroom.week5.developer;

public class JuniorDeveloper extends Developer {

    private long salary;

    public JuniorDeveloper() {
        super("cankacac string");
    }

    public JuniorDeveloper(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String getName() {
        return "*********";
    }

    @Override
    public long getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        JuniorDeveloper yan = new JuniorDeveloper("Yan", 45_000);
        System.out.println(yan.toString());
    }

}
