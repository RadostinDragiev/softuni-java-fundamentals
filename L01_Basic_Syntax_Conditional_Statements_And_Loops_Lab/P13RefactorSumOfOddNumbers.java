package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }

        System.out.printf("Sum: %d", sum);
    }
}
