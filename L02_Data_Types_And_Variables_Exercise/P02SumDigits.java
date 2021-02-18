package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int digitSum = 0;
        do {
            digitSum += number % 10;
            number /= 10;
        } while (number > 0);

        System.out.println(digitSum);
    }
}
