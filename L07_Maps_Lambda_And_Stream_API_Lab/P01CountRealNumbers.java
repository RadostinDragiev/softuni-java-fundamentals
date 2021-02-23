package L07_Maps_Lambda_And_Stream_API_Lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double[] numbers = new double[input.length];

        fromStringToDouble(input, numbers);

        Map<Double, Integer> listOfCounts = new TreeMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (listOfCounts.containsKey(numbers[i])) {
                listOfCounts.put(numbers[i], listOfCounts.get(numbers[i]) + 1);
            } else {
                listOfCounts.put(numbers[i], 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : listOfCounts.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }

    static void fromStringToDouble(String[] input, double[] numbers) {
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Double.parseDouble(input[i]);
        }
    }
}