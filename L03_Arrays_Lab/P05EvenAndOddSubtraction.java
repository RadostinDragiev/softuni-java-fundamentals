package L03_Arrays_Lab;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbersSum += number;
            } else {
                oddNumbersSum += number;
            }
        }

        int result = evenNumbersSum - oddNumbersSum;
        System.out.println(result);
    }
}
