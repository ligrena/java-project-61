package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenParity {

    public static void evenGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n");
        Random random = new Random();
        int sumAnswer = 0;
        for (int i = 1; i <= 3; i++) {
            int value = random.nextInt(100);
            System.out.printf("Question: %s\n", value);
            String yourAnswer = scanner.nextLine();
            System.out.printf("Your answer: %s\n", yourAnswer);
            switch (yourAnswer) {
                case "yes" :
                    if ((value % 2) == 0) {
                        System.out.println("Correct!");
                        sumAnswer = sumAnswer + 1;
                    } else {
                        System.out.printf("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                                + "Let's try again, %s!\n", userName);
                        sumAnswer = sumAnswer - 1;
                    }
                    break;
                case "no" :
                    if ((value % 2) == 0) {
                        System.out.printf("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                                + "Let's try again, %s!\n", userName);
                        sumAnswer = sumAnswer - 1;
                    } else {
                        System.out.println("Correct!");
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
