package L03_Arrays_Exercise;

import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == magicNumber) {
                    System.out.printf("%d %d%n", numbers[i], numbers[j]);
                }
            }
        }
    }
}
