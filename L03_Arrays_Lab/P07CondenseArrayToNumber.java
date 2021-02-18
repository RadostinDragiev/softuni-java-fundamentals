package L03_Arrays_Lab;

import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (j == numbers.length - 1) {
                    break;
                } else {
                    numbers[j] += numbers[j + 1];
                }
            }
        }

        System.out.println(numbers[0]);
    }
}