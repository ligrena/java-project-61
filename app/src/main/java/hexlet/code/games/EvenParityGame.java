package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class EvenParityGame {

    private static final String INFO_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";
    private static final int RANDOM = 100;

    public static void evenGame() {
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int value = Utils.getRandomNumber(RANDOM);

            questionsAndAnswers[i][0] = Integer.toString(value);
            questionsAndAnswers[i][1] = isEvenNumber(value) ? "yes" : "no";
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
