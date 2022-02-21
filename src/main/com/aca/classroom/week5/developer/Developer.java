package com.aca.classroom.week5.developer;

public class Developer extends Object {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Developer developer1 = new Developer("Arman");
        Developer developer2 = new Developer("Arman");
        Developer developer3 = developer2;

        System.out.println(developer1 == developer2);
        System.out.println(developer3 == developer2);
        System.out.println(developer1.equals(developer2));
    }

    @Override
    public boolean equals(final Object o) {
        Developer o1 = (Developer) o;
        return this.name.equals(o1.name);
    }

    @Override
    public int hashCode() {
        return 15;
    }

    public String toString() {
        return "Arman";
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return 60_000;
    }

    public long getBudget() {
        return 300;
    }

    // @Override
    // public String toString() {
    //     return "name " + getName() + " salary " + getSalary();
    // }
}
