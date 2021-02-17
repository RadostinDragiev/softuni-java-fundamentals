package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double divisionBy2 = number % 2;
        double divisionBy3 = number % 3;
        double divisionBy6 = number % 6;
        double divisionBy7 = number % 7;
        double divisionBy10 = number % 10;

        boolean isDivisible = true;
        String result = "";
        if (divisionBy10 == 0) {
            result = "The number is divisible by 10";
        } else if (divisionBy7 == 0) {
            result = "The number is divisible by 7";
        } else if (divisionBy6 == 0 || divisionBy2 == 0 && divisionBy3 == 0) {
            result = "The number is divisible by 6";
        } else if (divisionBy3 == 0) {
            result = "The number is divisible by 3";
        } else if (divisionBy2 == 0) {
            result = "The number is divisible by 2";
        } else {
            isDivisible = false;
        }


        if (isDivisible) {
            System.out.println(result);
        } else {
            System.out.println("Not divisible");
        }
    }
}
