package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double punds = scanner.nextDouble();

        double dollars = punds * 1.31;
        System.out.printf("%.3f", dollars);
    }
}
