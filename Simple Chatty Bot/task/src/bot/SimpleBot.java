package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");

        System.out.println(2 + 4 * 5 - 10 / (2 + 1));

        String yourName = scanner.next();


        System.out.println("What a great name you have, " + yourName + "!");
    }
}
