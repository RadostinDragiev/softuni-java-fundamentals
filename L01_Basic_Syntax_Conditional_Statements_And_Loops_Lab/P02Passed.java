package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}
