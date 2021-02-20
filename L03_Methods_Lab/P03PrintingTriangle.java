package L03_Methods_Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size; i++) {
            printTriangle(i);
        }

        for (int i = size - 1; i >= 1; i--) {
            printTriangle(i);
        }
    }

    static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
