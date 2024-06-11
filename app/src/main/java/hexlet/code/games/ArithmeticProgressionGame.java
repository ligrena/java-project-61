package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ArithmeticProgressionGame {

    private static final String INFO_GAME = "What number is missing in the progression?\n";
    private static final int LENGTH = 10;
    private static final int RANDOM = 100;
    private static final int RANDOM_DIFF = 19;

    public static void arithmeticProgressionGame() {
        Random random = new Random();
        int numberQuestions = Engine.COUNT_ROUND_GAME;

        String[][] questionsAndAnswers = new String[numberQuestions][2];

        for (int i = 0; i < numberQuestions; i++) {
            int firstNumber = random.nextInt(RANDOM);
            int diff = random.nextInt(RANDOM_DIFF) + 1;
            int skipNumber = random.nextInt(LENGTH);

            int[] progression = generateProgression(firstNumber, diff, LENGTH);

            questionsAndAnswers[i][0] = buildQuestion(progression, skipNumber);
            questionsAndAnswers[i][1] = Integer.toString(firstNumber + diff * skipNumber);
        }
        Engine.startGame(INFO_GAME, questionsAndAnswers);
    }

    private static int[] generateProgression(int firstNumber, int diff, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            progression[i] = firstNumber + diff * i;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int skipNumber) {
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < progression.length; j++) {
            if (j == skipNumber) {
                builder.append(".. ");
            } else {
                builder.append(progression[j]);
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
