package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class ArithmeticProgressionGame {

    public static void arithmeticProgressionGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?\n");

        Random random = new Random();
        int sumAnswer = 0;

        for (int i = 1; i <= 3; i++) {
            int length = 10;
            int firstNumber = random.nextInt(100);
            int diff = random.nextInt(19) + 1;
            int skipNumber = random.nextInt(length);

            int[] progression = generateProgression(firstNumber, diff, length);

            String value = buildQuestion(progression, skipNumber);
            Engine.question(value);

            String numberAnswer = scanner.nextLine();
            Engine.answer(numberAnswer);

            value = Integer.toString(firstNumber + diff * skipNumber);

            if (value.equals(numberAnswer)) {
                System.out.println(Engine.CORRECT_ANSWER);
                sumAnswer = sumAnswer + 1;
            } else {
                System.out.printf(Engine.WRONG_ANSWER, numberAnswer, value, userName);
                sumAnswer = sumAnswer - 1;
            }
        }

        if (sumAnswer == 3) {
            System.out.printf("Congratulations, %s!", userName);
        }
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
