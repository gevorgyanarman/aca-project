package com.aca.classroom.week7.clone;

public class Animal implements Cloneable {

    private AnimalType type;
    private String name;

    public Animal(AnimalType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        final Object clone = super.clone();
        return (Animal) clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new Animal(AnimalType.PREDATOR, "TIGER");
        System.out.println(tiger.clone().getClass());
    }
}
