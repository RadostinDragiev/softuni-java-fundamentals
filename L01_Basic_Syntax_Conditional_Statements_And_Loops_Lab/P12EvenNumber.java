package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (!(number % 2 == 0)) {
            System.out.println("Please write an even number.");
            number = scanner.nextInt();
        }

        System.out.printf("The number is: %d", Math.abs(number));
    }
}
