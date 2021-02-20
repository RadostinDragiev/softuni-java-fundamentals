package L03_Methods_Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCalculation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (typeCalculation.equals("add")) {
            printNumbersAdd(a, b);
        } else if (typeCalculation.equals("multiply")) {
            printNumbersMultiply(a, b);
        } else if (typeCalculation.equals("subtract")) {
            printNumbersSubtract(a, b);
        } else {
            printNumbersDivide(a, b);
        }
    }

    static void printNumbersAdd(int a, int b) {
        System.out.println(a + b);
    }

    static void printNumbersMultiply(int a, int b) {
        System.out.println(a * b);
    }

    static void printNumbersSubtract(int a, int b) {
        System.out.println(a - b);
    }

    static void printNumbersDivide(int a, int b) {
        System.out.println(a / b);
    }
}