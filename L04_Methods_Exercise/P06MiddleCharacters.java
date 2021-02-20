package L04_Methods_Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleLetter(text);
    }

    static void printMiddleLetter(String text) {
        int middlePosition = text.length() / 2;

        if (text.length() % 2 == 0) {
            System.out.print(text.charAt(middlePosition - 1) + "" + text.charAt(middlePosition));
        } else {
            System.out.print(text.charAt(middlePosition));
        }
    }
}
