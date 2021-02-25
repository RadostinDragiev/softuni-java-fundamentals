package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (String s : input) {
            sum += calculateEachSum(s);
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculateEachSum(String input) {
        double number = getNumber(input);
        if (Character.isUpperCase(input.charAt(0))) {
            int charPosition = input.charAt(0) - 64;
            number /= charPosition;
        }
        if (Character.isLowerCase(input.charAt(0))) {
            int charPosition = input.charAt(0) - 96;
            number *= charPosition;
        }
        if (Character.isUpperCase(input.charAt(input.length() - 1))) {
            int charPosition = input.charAt(input.length() - 1) - 64;
            number -= charPosition;
        }
        if (Character.isLowerCase(input.charAt(input.length() - 1))) {
            int charPosition = input.charAt(input.length() - 1) - 96;
            number += charPosition;
        }

        return number;
    }

    private static double getNumber(String input) {
        StringBuilder number = new StringBuilder();
        for (int i = 1; i < input.length() - 1; i++) {
            number.append(input.charAt(i));
        }

        return Double.parseDouble(number.toString());
    }
}