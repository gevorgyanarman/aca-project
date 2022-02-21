package com.aca.classroom.week3.game;

public class Game {

    String name;
    long shootCount;

    public static void main(String[] args) {
        Game firstGame = new Game();
        firstGame.name = "game1";

        firstGame.print();
    }

    public void print() {
        System.out.println("name: " + name + " shoot: " + shootCount);
    }
}
