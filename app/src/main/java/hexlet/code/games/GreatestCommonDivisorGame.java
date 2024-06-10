package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivisorGame {

    public static void gcdGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.\n");

        int sumAnswer = 0;

        for (int i = 1; i <= 3; i++) {
            int numberA = new Random().nextInt(100);
            int numberB = new Random().nextInt(100);

            String value = String.format("%s %s", numberA, numberB);
            Engine.question(value);
            int yourAnswer = scanner.nextInt();
            Engine.answer(yourAnswer);

            int gcd = getGCD(numberA, numberB);
            correctOrIncorrect(gcd, yourAnswer, userName);
        }
        if (sumAnswer == 3) {
            System.out.printf("Congratulations, %s!", userName);
        }
    }

    private static void correctOrIncorrect(int value, int yourAnswer, String userName) {
        int sumAnswer = 0;

        if (value == yourAnswer) {
            System.out.println(Engine.CORRECT_ANSWER);
            sumAnswer = sumAnswer + 1;
        } else {
            System.out.printf(Engine.WRONG_ANSWER, yourAnswer, value, userName);
            sumAnswer = sumAnswer - 1;
        }
    }

    private static int getGCD(int numberA, int numberB) {
        int result = 0;
        int a = Math.max(numberA, numberB);
        int b = Math.min(numberA, numberB);

        result = b;
        while (a % b != 0) {
            result = a % b;
            a = b;
            b = result;
        }
        return result;
    }
}
