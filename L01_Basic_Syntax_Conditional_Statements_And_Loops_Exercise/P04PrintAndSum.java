package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (startNumber <= endNumber) {
            System.out.print(startNumber + " ");
            sum += startNumber;
            startNumber++;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
