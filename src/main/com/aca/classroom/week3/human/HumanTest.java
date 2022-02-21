package com.aca.classroom.week3.human;

public class HumanTest {

    public static void main(String[] args) {
        Human human1 = new Human("Jane", 160);

        System.out.println(human1.getStringRepresentation());

        Human human2 = new Human("Mark", -150);

        System.out.println(human2.getStringRepresentation());

        Human human3 = new Human("Eric", -190);

        System.out.println(human1.getName());

        System.out.println(human3.getStringRepresentation());
    }
}
