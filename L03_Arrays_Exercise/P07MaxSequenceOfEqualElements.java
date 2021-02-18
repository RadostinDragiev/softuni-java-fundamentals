package L03_Arrays_Exercise;

import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int equalMax = 0;
        int equalIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentEqualMax = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (!(numbers[i] == numbers[j])) {
                    currentEqualMax = 0;
                    break;
                } else {
                    currentEqualMax++;
                }

                if (currentEqualMax > equalMax) {
                    equalMax = currentEqualMax;
                    equalIndex = i;
                }
            }
        }

        for (int i = 0; i <= equalMax; i++) {
            System.out.print(numbers[equalIndex] + " ");
        }
    }
}