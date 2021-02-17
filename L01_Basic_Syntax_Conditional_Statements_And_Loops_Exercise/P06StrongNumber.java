package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String str = Integer.toString(number);
        int numberToCalculate = number;
        int justToTest = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int fact = 1;
            if (i >= 1) {
                numberToCalculate /= 10;
            }
            justToTest = numberToCalculate % 10;
                        for (int j = 1; j <= justToTest ; j++) {
                fact = fact * j;
            }
            sum += fact;
        }

        if (number == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}