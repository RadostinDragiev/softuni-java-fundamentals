package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P11multiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = scanner.nextInt();

        while (counter <= 10) {
            System.out.printf("%d X %d = %d%n", number, counter, number * counter);
            counter++;
        }

        if (counter > 11) {
            System.out.printf("%d X %d = %d%n", number, counter, number * counter);
        }
    }
}
