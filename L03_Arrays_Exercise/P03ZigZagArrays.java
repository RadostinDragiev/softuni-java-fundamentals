package L03_Arrays_Exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        int[] lineOne = new int[lines];
        int[] lineTwo = new int[lines];

        for (int i = 0; i < lines; i++) {
            int numberOne = scanner.nextInt();
            int numberTwo = scanner.nextInt();
            if (i % 2 == 0) {
                lineOne[i] = numberOne;
                lineTwo[i] =  numberTwo;
            } else {
                lineOne[i] = numberTwo;
                lineTwo[i] =  numberOne;
            }
        }

        for (int value : lineOne) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : lineTwo) {
            System.out.print(value + " ");
        }
    }
}
