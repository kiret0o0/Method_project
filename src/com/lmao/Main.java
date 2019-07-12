package com.lmao;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Persei ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Liubo ", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "manage to get into position "
                + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int PlayerScore) {
        if (PlayerScore >= 1000) {
            return 1;
        } else if (PlayerScore >= 500 && PlayerScore < 1000) {
            return 2;
        } else if (PlayerScore >= 100 && PlayerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}