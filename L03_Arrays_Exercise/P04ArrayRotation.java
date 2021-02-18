package L03_Arrays_Exercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int rotationNumber = Integer.parseInt(scanner.nextLine());

        rotationNumber %= numbers.length;
        for (int i = 0; i < rotationNumber; i++) {
            String[] tempNum = new String[1];
            tempNum[0] = numbers[0];

            for (int j = 1; j < numbers.length; j++) {
                numbers[j - 1] = numbers[j];
            }

            numbers[numbers.length - 1] = tempNum[0];
        }

        System.out.print(String.join(" ", numbers));
    }
}
