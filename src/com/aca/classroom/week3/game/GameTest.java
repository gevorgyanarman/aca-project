package com.aca.classroom.week3.game;

public class GameTest {

    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game();

        Game[] gameArray = new Game[2];
        gameArray[0] = game1;
        gameArray[1] = game2;

        Player player1 = new Player();
        player1.username = "aca";
        player1.games = gameArray;
    }
}
