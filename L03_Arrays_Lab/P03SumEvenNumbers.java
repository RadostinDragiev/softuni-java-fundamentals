package L03_Arrays_Lab;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numbersInString = input.split( " ");
        int[] numbers = new int[numbersInString.length];
        int sum = 0;
        for (int i = 0; i < numbersInString.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
