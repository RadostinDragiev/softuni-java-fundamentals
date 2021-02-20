package L04_Methods_Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printEqual(scanner, input);
    }

    static void printEqual(Scanner scanner, String input) {
        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            int reversedNumber = reversedNumber(input);
            if (number == reversedNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

    static int reversedNumber(String number) {
        String[] numberStrArr = number.split("");
        int[] numberInArr = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numberInArr[i] = Integer.parseInt(String.valueOf(numberStrArr[(number.length() - 1) - i]));
        }

        return Integer.parseInt(numberAsStrArr(numberInArr));
    }

    static String numberAsStrArr(int[] number) {
        String[] numberStrArr = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            numberStrArr[i] = String.valueOf(number[i]);
        }

        return String.join("", numberStrArr);
    }
}
