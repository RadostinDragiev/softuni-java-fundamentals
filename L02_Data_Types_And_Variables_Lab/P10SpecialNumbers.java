package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int tempNumb = i;
            int digitSum = 0;

            do {
                digitSum += tempNumb % 10;
                tempNumb /= 10;
            } while (tempNumb > 0);

            if (digitSum == 5 || digitSum == 7 || digitSum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
