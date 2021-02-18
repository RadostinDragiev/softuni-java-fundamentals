package L03_Arrays_Exercise;

import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");


        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        boolean areTheyEqual = false;
        int middleIndex = 0;
        for (int i = 0; i < input.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int leftCalc = 0; leftCalc < i; leftCalc++) {
                sumLeft += numbers[leftCalc];
            }

            for (int rightCalc = i + 1; rightCalc < input.length; rightCalc++) {
                sumRight += numbers[rightCalc];
            }

            if (sumLeft == sumRight) {
                areTheyEqual = true;
                middleIndex = i;
                break;
            }

        }

        if (areTheyEqual) {
            System.out.println(middleIndex);
        } else {
            System.out.println("no");
        }
    }
}
