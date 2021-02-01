package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random x = new Random();
        Player player1 = new Player(x.nextInt((11)) + 90);
        Player player2 = new Player(x.nextInt((11)) + 90);
        Player player3 = new Player(x.nextInt((11)) + 90);
        Player player4 = new Player(x.nextInt((11)) + 90);
        Player player5 = new Player(x.nextInt((11)) + 90);
        Player player6 = new Player(x.nextInt((11)) + 90);
        Player.info();
        for (int i = 0; i < 101; i++) {
            player6.run();
            player2.run();
        }
        Player.info();


    }
}





