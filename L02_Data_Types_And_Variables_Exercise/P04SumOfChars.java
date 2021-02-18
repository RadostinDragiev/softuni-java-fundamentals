package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbolCount = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < symbolCount; i++) {
            char singleChar = scanner.next().charAt(0);
            sum += singleChar;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
