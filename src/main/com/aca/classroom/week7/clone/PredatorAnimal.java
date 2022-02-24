package com.aca.classroom.week7.clone;

public class PredatorAnimal extends Animal {

    public PredatorAnimal(String name) {
        super(AnimalType.PREDATOR, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tigar = new PredatorAnimal("tigar");
        Animal clonedPredator = tigar.clone();
        System.out.println(clonedPredator.getClass());
    }
}
