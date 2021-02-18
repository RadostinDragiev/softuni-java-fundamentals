package L03_Arrays_Exercise;

import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(numbersStr[i]));
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!(numbers[i] > numbers[j])) {
                    break;
                }
                if (j + 1 == numbers.length) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }

        System.out.println(numbers[numbers.length - 1]);
    }
}
