package L04_Methods_Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        printSum(firstNumber, secondNumber);
    }

    static void printSum(int firstNumber, int secondNumber) {
        System.out.printf("%.2f", factorialCalculation(firstNumber) / factorialCalculation(secondNumber));
    }
    
    static double factorialCalculation(int number) {
        double sum = number;
        for (int i = number - 1; i >= 1; i--) {
            sum *= i;
        }

        return sum;
    }

}
