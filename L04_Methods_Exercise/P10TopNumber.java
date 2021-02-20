package L04_Methods_Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);
    }

    static void topNumber(int number) {
        for (int i = 1; i < number; i++) {
            if (digitsSum(i) % 8 == 0 && containsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    static int digitsSum(int number) {
        int digitSum = 0;
        for (int i = 0; 0 < number; i++) {
            int lastNumber = number % 10;
            digitSum += lastNumber;
            number /= 10;
        }

        return digitSum;
    }

    static boolean containsOddDigit(int number) {
        int oddNumbers = 0;
        for (int i = 0; 0 < number; i++) {
            int lastNumber = number % 10;
            if (lastNumber % 2 != 0) {
                oddNumbers++;
            }
            number /= 10;
        }

        if (oddNumbers > 1) {
            return true;
        } else {
            return false;
        }
    }
}
