package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class EvenParityGame {

    public static void evenGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n");
        Random random = new Random();
        int sumAnswer = 0;
        for (int i = 1; i <= 3; i++) {
            int value = random.nextInt(100);
            Engine.question(value);

            String yourAnswer = scanner.nextLine();
            Engine.answer(yourAnswer);

            switch (yourAnswer) {
                case "yes" :
                    if ((value % 2) == 0) {
                        System.out.println(Engine.CORRECT_ANSWER);
                        sumAnswer = sumAnswer + 1;
                    } else {
                        System.out.printf(Engine.WRONG_ANSWER, "yes", "no", userName);
                        sumAnswer = sumAnswer - 1;
                    }
                    break;
                case "no" :
                    if ((value % 2) == 0) {
                        System.out.printf(Engine.WRONG_ANSWER, "no", "yes", userName);
                        sumAnswer = sumAnswer - 1;
                    } else {
                        System.out.println(Engine.CORRECT_ANSWER);
                        sumAnswer = sumAnswer + 1;
                    }
                    break;
                default:
                    break;
            }
        }
        if (sumAnswer == 3) {
            System.out.printf("Congratulations, %s!", userName);
        }
    }
}
