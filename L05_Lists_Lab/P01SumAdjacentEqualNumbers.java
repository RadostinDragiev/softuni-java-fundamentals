package L05_Lists_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");

        listScanner(numbers, input);

        sumNumbers(numbers);

        printList(numbers);
    }

    private static void printList(List<Double> numbers) {
        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.####").format(number) + " ");
        }
    }

    private static void sumNumbers(List<Double> numbers) {
        int indexCounter = 0;
        while (indexCounter < numbers.size() - 1) {
            double currentNumberIndex = numbers.get(indexCounter);
            double nextNumberIndex = numbers.get(indexCounter + 1);
            if (numbers.get(indexCounter).equals(numbers.get(indexCounter + 1))) {
                numbers.set(indexCounter, (currentNumberIndex + nextNumberIndex));
                numbers.remove(numbers.get(indexCounter + 1));
                if (indexCounter > 0) {
                    indexCounter = 0;
                }
            } else {
                indexCounter++;
            }
        }
    }

    private static void listScanner(List<Double> numbers, String[] input) {
        for (int i = 0; i < input.length; i++) {
            numbers.add(Double.parseDouble(input[i]));
        }
    }
}
