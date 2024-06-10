package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenParityGame {

    private static final String INFO_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";

    public static void evenGame() {
        Random random = new Random();
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int value = random.nextInt(100);

            questionsAndAnswers[i][0] = Integer.toString(value);
            questionsAndAnswers[i][1] = ((value % 2) == 0) ? "yes" : "no";
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }
}
