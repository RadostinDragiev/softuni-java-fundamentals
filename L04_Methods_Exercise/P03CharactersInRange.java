package L04_Methods_Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        if (firstChar > secondChar) {
            printCharsFromLowest(secondChar, firstChar);
        } else {
            printCharsFromLowest(firstChar, secondChar);
        }
    }

    static void printCharsFromLowest(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
