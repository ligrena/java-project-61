package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }
}
