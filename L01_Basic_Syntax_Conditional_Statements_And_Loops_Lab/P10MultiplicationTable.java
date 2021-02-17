package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counter = 1;
        while (counter <= 10) {
            System.out.printf("%d X %d = %d%n", number, counter, number * counter);
            counter++;
        }
    }
}
