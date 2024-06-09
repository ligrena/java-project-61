package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String answer = scanner.nextLine();
        System.out.println(String.format("Hello, %s!", answer));
    }
}
